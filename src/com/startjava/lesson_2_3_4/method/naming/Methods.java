package com.startjava.lesson_2_3_4.method.naming;

public class Methods {
    public static String getCurrName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}