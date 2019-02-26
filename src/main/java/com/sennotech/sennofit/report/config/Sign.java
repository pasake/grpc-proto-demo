package com.sennotech.sennofit.report.config;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.sennotech.sennofit.report.config.Base64;

/**
 * @author 黄艳婷
 * @create 2019-01-29 16:16
 */
public class Sign {

    // 编码方式
    private static final String CONTENT_CHARSET = "UTF-8";

    /**
     * 签名
     *
     * @param signStr         被加密串
     * @param secret          加密密钥
     * @param signatureMethod 签名算法
     * @return 签名结果
     * @author cicerochen@tencent.com
     */
    static String sign(String signStr, String secret, String signatureMethod)
            throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
        String sig;
        Mac mac1 = Mac.getInstance("HmacSHA1");
        Mac mac2 = Mac.getInstance("HmacSHA256");
        byte[] hash;
        if (signatureMethod.equals("HmacSHA256")) {
            SecretKeySpec secretKey =
                    new SecretKeySpec(secret.getBytes(CONTENT_CHARSET), mac2.getAlgorithm());
            mac2.init(secretKey);
            hash = mac2.doFinal(signStr.getBytes(CONTENT_CHARSET));
        } else {
            SecretKeySpec secretKey =
                    new SecretKeySpec(secret.getBytes(CONTENT_CHARSET), mac1.getAlgorithm());
            mac1.init(secretKey);
            hash = mac1.doFinal(signStr.getBytes(CONTENT_CHARSET));
        }

        sig = Base64.encode(hash);
        return sig;
    }

    static String makeSignPlainText(TreeMap<String, Object> requestParams,
            String requestMethod, String requestHost, String requestPath) {

        String retStr = "";
        retStr += requestMethod;
        retStr += requestHost;
        retStr += requestPath;
        retStr += buildParamStr(requestParams, requestMethod);
        return retStr;
    }

    private static String buildParamStr(TreeMap<String, Object> requestParams,
            String requestMethod) {

        StringBuilder retStr = new StringBuilder();
        for (String key : requestParams.keySet()) {
            String value = requestParams.get(key).toString();
            //排除上传文件的参数
            if ("POST".equals(requestMethod) && (!value.isEmpty()) && value.substring(0, 1)
                    .equals("@")) {
                continue;
            }
            if (retStr.length() == 0) {
                retStr.append('?');
            } else {
                retStr.append('&');
            }
            retStr.append(key.replace("_", ".")).append('=').append(value);

        }
        return retStr.toString();
    }
}
