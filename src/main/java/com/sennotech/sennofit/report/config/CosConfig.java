package com.sennotech.sennofit.report.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 黄艳婷
 * @create 2018-12-26 17:02
 */
@ConfigurationProperties(prefix = "cos")
@Component
@Setter
@Getter
public class CosConfig {

    public String endpoint;
    public String secretId;
    public String secretKey;
    public String appId;
    public String bucketName;
    public String region;
    public Folder folder;
    public Action action;
    public int durationSeconds;

    @Setter
    @Getter
    public static class Folder {

        public String report;
        public String goods;
        public String disease;
        public String parts;
        public String avatar;
        public String sign;
    }

    @Setter
    @Getter
    public static class Action {

        public String putObject;
        public MultipartUpload multipartUpload;
        public String postObject;
        public String getObject;
    }

    @Setter
    @Getter
    public static class MultipartUpload {

        public String initiateMultipartUpload;
        public String listParts;
        public String uploadPart;
        public String completeMultipartUpload;
        public String abortMultipartUpload;

    }
}
