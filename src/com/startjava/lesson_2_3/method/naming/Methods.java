package com.startjava.lesson_2_3.method.naming;

public class Methods {
    public static String getCurrName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}