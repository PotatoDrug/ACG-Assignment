package com.secureftp.client;

import com.secureftp.common.Utils;

public class Output {
    public static void error(String msg) {
        System.out.println(Utils.ANSI_RED + msg + Utils.ANSI_RESET);
    }
    public static void info(String msg) {
        System.out.println(Utils.ANSI_CYAN + msg + Utils.ANSI_RESET);
    }
}