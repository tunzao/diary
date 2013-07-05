package com.diary.common.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created with IntelliJ IDEA.
 * User: likuan
 * Date: 7/4/13
 * Time: 10:39 AM
 * To change this template use File | Settings | File Templates.
 */
 public class MD5 {
    private static String[] hexDigits = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public static String digest(String content) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(content.getBytes());
        byte[] bytes = md.digest();
        return byteArrayToHex(bytes);
    }

    private static String byteArrayToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder(32);
        for (int i=0;i<bytes.length; i++) {
            sb.append(byteToHex(bytes[i]));
        }
        return sb.toString();
    }

    private static String byteToHex(byte n) {
        int a = n;
        if (a < 0) {
            a += 256;
        }
        int high = a / 16;
        int low = a % 16;
        return hexDigits[high] + hexDigits[low];
    }
}
