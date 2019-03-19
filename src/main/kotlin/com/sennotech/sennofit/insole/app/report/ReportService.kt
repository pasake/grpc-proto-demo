package com.sennotech.sennofit.insole.app.report

import com.sennotech.base.account.generated.AccountServiceGrpc
import com.sennotech.base.common.grpc.ContextKeys
import com.sennotech.sennofit.common.exceptions.SennofitExceptions
import com.sennotech.sennofit.insole.app.report.generated.Report
import io.grpc.ManagedChannelBuilder
import org.springframework.http.HttpEntity
import org.springframework.http.MediaType
import org.springframework.http.client.MultipartBodyBuilder
import org.springframework.stereotype.Service
import org.springframework.util.MultiValueMap
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.client.WebClient
import java.util.*
import javax.annotation.PostConstruct

/**
 * @author 严鸿豪
 * @create 2019-03-14 16:13
 */
@Service
class ReportService(
        private val senno: Senno,
        private val cosConfig: CosConfig,
        private val reportRepository: ReportRepository
) {

    private val imagesUrlPost: String = senno.algo!!.image!!.post!!
    private val imagesUrlDataGet: String = senno.algo!!.image!!.get!!.data!!
    private val imagesUrlImagesGet: String = senno.algo!!.image!!.get!!.images!!
    private val root: String = senno.algo!!.root!!
    private val videosUrlPost: String = senno.algo!!.video!!.post!!
    private val videosUrlGet: String = senno.algo!!.video!!.get!!.videos!!
    private val webClient: WebClient = WebClient.builder().baseUrl(root).build()

    private lateinit var accountStub: AccountServiceGrpc.AccountServiceBlockingStub

    @PostConstruct
    fun postConstrust() {
        val accountChannel = ManagedChannelBuilder.forAddress(
                "senno-account-app-service.senno-playground", 50051)
                .usePlaintext()
                .build()
        accountStub = AccountServiceGrpc.newBlockingStub(accountChannel)
    }

    fun uploadProfile(request: Report.UploadProfileRequest): Long {
        val accessContext = ContextKeys.accessContext.get()
                ?: throw SennofitExceptions.AccountIdIsNull("0622a1f6-6976-43f5-a3e1-be76b50cbcd0")

        val imageUUID = uploadImage(request.frontPosture, request.sidePosture)
        val videoUUID = uploadVideo(request.gait)
        println(imageUUID.toString())
        println(videoUUID.toString())
        val accountId = accessContext.accountContext.accountId
//        val accountId = 1008611L
        val endoint = cosConfig.endpoint + "/"

        val frontImageUrl = endoint + request.frontPosture
        val sideImageUrl = endoint + request.sidePosture
        val leftFootUrl = endoint + request.leftFoot
        val rightFootUrl = endoint + request.rightFoot

        val entity = ReportEntity(
                images = imageUUID,
                video = videoUUID,
                accountId = accountId,
                status = "process",
                originImages = OriImage(
                        frontImageUrl = frontImageUrl,
                        sideImageUrl = sideImageUrl,
                        leftFootUrl = leftFootUrl,
                        rightFootUrl = rightFootUrl
                )
        )
        reportRepository.save(entity)
        return accountId
    }

    fun uploadVideo(video: String): UUID {
        return webClient.post()
                .uri(videosUrlPost)
                .contentType(MediaType.MULTIPART_FORM_DATA)
                .body(BodyInserters.fromMultipartData(paramsVideo(video)))
                .retrieve()
                .bodyToMono(RspUUID::class.java)
                .blockOptional()
                .orElseThrow {
                    Exceptions.AlgoRpcError("d289ba0c-d944-41ec-bc94-c1c52397b8df",
                            "UUID is null")
                }.uuid
    }

    data class RspUUID(
            val uuid: UUID
    )

    fun uploadImage(front: String, side: String): UUID {
        return webClient.post()
                .uri(imagesUrlPost)
                .contentType(MediaType.MULTIPART_FORM_DATA)
                .body(BodyInserters.fromMultipartData(params4Image(front, side)))
                .retrieve()
                .bodyToMono(RspUUID::class.java)
                .blockOptional()
                .orElseThrow {
                    Exceptions.AlgoRpcError("d289ba0c-d943-41ec-bc94-c1c52397b8df",
                            "UUID is null")
                }.uuid
    }

    fun paramsVideo(video: String): MultiValueMap<String, HttpEntity<*>> {
        val builder = MultipartBodyBuilder()

        builder.part("video", video)
        builder.part("bucketUrl", cosConfig.endpoint!!)
        builder.part("callback", senno.notification!!.video!!)

        return builder.build()
    }

    fun params4Image(front: String, side: String): MultiValueMap<String, HttpEntity<*>> {
        val builder = MultipartBodyBuilder()

        builder.part("front", front)
        builder.part("side", side)
        builder.part("bucketUrl", cosConfig.endpoint!!)
        builder.part("callback", senno.notification!!.posture!!)

        return builder.build()
    }
}