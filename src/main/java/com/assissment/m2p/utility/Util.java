package com.assissment.m2p.utility;

public class Util {

    public static boolean isEmpty(String inpStr) {
        if (inpStr == null || inpStr == "" || inpStr.length() == 0) return true;
        if (inpStr != null && inpStr.isEmpty()) return true;
        if (inpStr != null && inpStr.trim().length() == 0) return true;
        return false;
    }
}
