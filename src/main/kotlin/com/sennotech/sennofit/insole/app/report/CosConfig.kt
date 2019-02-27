package com.sennotech.sennofit.insole.app.report


import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

import lombok.Getter
import lombok.Setter

/**
 * @author 黄艳婷
 * @create 2018-12-26 17:02
 */
@ConfigurationProperties(prefix = "cos")
@Component
@Setter
@Getter
class CosConfig {

    var endpoint: String? = null
    var secretId: String? = null
    var secretKey: String? = null
    var appId: String? = null
    var bucketName: String? = null
    var region: String? = null
    var folder: Folder? = null
    var action: Action? = null
    var durationSeconds: Int = 0

    @Setter
    @Getter
    class Folder {

        var report: String? = null
        var goods: String? = null
        var disease: String? = null
        var parts: String? = null
        var avatar: String? = null
        var sign: String? = null
    }

    @Setter
    @Getter
    class Action {

        var putObject: String? = null
        var multipartUpload: MultipartUpload? = null
        var postObject: String? = null
        var getObject: String? = null
    }

    @Setter
    @Getter
    class MultipartUpload {

        var initiateMultipartUpload: String? = null
        var listParts: String? = null
        var uploadPart: String? = null
        var completeMultipartUpload: String? = null
        var abortMultipartUpload: String? = null

    }
}
