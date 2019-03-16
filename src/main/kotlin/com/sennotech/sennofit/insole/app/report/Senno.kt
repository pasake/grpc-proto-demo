package com.sennotech.sennofit.insole.app.report

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

import lombok.Getter
import lombok.Setter

/**
 * @author 黄艳婷
 * @create 2018-10-20 15:30
 */
@Component
@ConfigurationProperties(prefix = "senno")
@Setter
@Getter
class Senno {

    var algo: Algo? = null
    var directory: Directory? = null
    var notification: Notification? = null

    @Setter
    @Getter
    class Algo {
        var root: String? = null
        var image: Uri? = null
        var video: Uri? = null
    }

    @Setter
    @Getter
    class Uri {
        var post: String? = null
        var get: Get? = null
    }

    @Setter
    @Getter
    class Get {
        var data: String? = null
        var images: String? = null
        var videos: String? = null
    }

    @Setter
    @Getter
    class Directory {
        var temp: String? = null
    }

    @Setter
    @Getter
    class Notification {

        var posture: String? = null
        var video: String? = null
    }
}
