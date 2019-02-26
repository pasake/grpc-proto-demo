package com.sennotech.sennofit.report.config;

import java.security.MessageDigest;

/**
 * @author 黄艳婷
 * @create 2019-01-29 16:13
 */
class MD5 {

    static String stringToMD5(String str) {

        try {
            byte[] strTemp = str.getBytes();
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            return toHexString(mdTemp.digest());
        } catch (Exception e) {
            return null;
        }
    }

    private static String toHexString(byte[] md) {
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f'};
        int j = md.length;
        char str[] = new char[j * 2];
        for (int i = 0; i < j; i++) {
            byte byte0 = md[i];
            str[2 * i] = hexDigits[byte0 >>> 4 & 0xf];
            str[i * 2 + 1] = hexDigits[byte0 & 0xf];
        }
        return new String(str);
    }
}
