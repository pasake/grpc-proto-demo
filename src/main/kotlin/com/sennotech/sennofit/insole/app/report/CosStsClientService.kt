package com.sennotech.sennofit.insole.app.report

import com.sennotech.base.common.util.logger
import com.sennotech.sennofit.insole.app.report.generated.Report
import com.sennotech.sennofit.report.config.CosStsClient
import org.springframework.stereotype.Service
import java.io.IOException
import java.lang.NullPointerException
import java.util.*

/**
 * @author 严鸿豪
 * @create 2019-01-29 16:31
 */
@Service
class CosStsClientService(private val cosConfig: CosConfig) {

    private val log = logger()
    private val SECRETID: String
    private val SECRETKEY: String
    private val DURATION: String
    private val BUCKET: String
    private val REGION: String
    private val PREFIX: String
    private val ACTIONS: String

    // 设置允许上传的路径前缀
    // 设置密钥的权限列表
    // 简单上传
    // 分片上传
    // post上传
    val reportCredential: Report.GenReportCredentialResponse
        get() {
            val config = baseConfig
            config[PREFIX] = cosConfig.folder!!.report + "/*"
            config[ACTIONS] = arrayOf(cosConfig.action!!.putObject,
                    cosConfig.action!!.multipartUpload?.initiateMultipartUpload,
                    cosConfig.action!!.multipartUpload?.listParts,
                    cosConfig.action!!.multipartUpload?.uploadPart,
                    cosConfig.action!!.multipartUpload?.completeMultipartUpload,
                    cosConfig.action!!.multipartUpload?.abortMultipartUpload,
                    cosConfig.action!!.postObject)

            return getCredential(config, cosConfig.folder!!.report!!)
        }

    // 固定密钥
    // 固定密钥
    // 设置临时密钥有效时长(默认一个签名未为10分钟有效，防止签名过长，导致泄露)
    // bucket
    // bucket 所在地域
    private val baseConfig: TreeMap<String, Any>
        get() {
            val config = TreeMap<String, Any>()
            config[SECRETID] = cosConfig.secretId!!
            config[SECRETKEY] = cosConfig.secretKey!!
            config[DURATION] = cosConfig.durationSeconds
            config[BUCKET] = cosConfig.bucketName!!
            config[REGION] = cosConfig.region!!

            return config
        }

    // 设置允许上传的路径前缀
    // 设置密钥的权限列表
    // 简单上传
    val analystSignCredential: Report.GenReportCredentialResponse
        get() {
            val config = baseConfig
            config[PREFIX] = cosConfig.folder!!.sign + "/*"
            config[ACTIONS] = arrayOf(cosConfig.action!!.putObject)

            return getCredential(config, cosConfig.folder!!.sign!!)
        }

    init {

        this.SECRETID = "SecretId"
        this.SECRETKEY = "SecretKey"
        this.DURATION = "durationSeconds"
        this.BUCKET = "bucket"
        this.REGION = "region"
        this.PREFIX = "allowPrefix"
        this.ACTIONS = "allowActions"
    }

    private fun getCredential(config: TreeMap<String, Any>, prefix: String): Report.GenReportCredentialResponse {
        try {
            val result = CosStsClient.getCredential(config)
            log.info("获取临时密钥结果：{}", result)
            if (result.isNull("credentials")) {
                val error = result.getJSONObject("Error")

                log.error("fail to get credential with requestId: {}, msg: {}, details: {}",
                        result.getString("RequestId"), error.getString("Code"),
                        error.getString("Message"))

                throw Exceptions.IllegalArgument("efe031e9-d1ef-4147-9668-771104573449"
                        , "Error msg: " + error.getString("Code")
                        + ", deatils: " + error.getString("Message"))
            }

            val credentials = result.getJSONObject("credentials")

            return Report.GenReportCredentialResponse.newBuilder().apply {
                startTime = startTimeBuilder.setSeconds(result["startTime"].toString().toLong()).build()
                expiredTime = expiredTimeBuilder.setSeconds(result["expiredTime"].toString().toLong()).build()
                requestId = result["requestId"] as String
                credentialsRsp = Report.CredentialsDto.newBuilder().apply {
                    tmpSecretId = credentials["tmpSecretId"] as String
                    tmpSecretKey = credentials["tmpSecretKey"] as String
                    sessionToken = credentials["sessionToken"] as String
                }.build()
                configRsp = Report.CosConfigDto.newBuilder().apply {
                    appid = cosConfig.appId
                    bucket = cosConfig.bucketName
                    region = cosConfig.region
                    keyPrefix = prefix
                }.build()
            }.build()
        } catch (e: IOException) {
            log.error("interface class name: {}, method name: {} msg: {}, details: {}",
                    "CosStsClientServiceImpl", "getCredential()", e.message, e)
            throw Exceptions.IllegalArgument("f5a86f78-bcf6-4582-b109-08a839a0cc5e",
                    "Invalid secret")
        }
    }
}
