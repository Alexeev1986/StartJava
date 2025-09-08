package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class HackPassword {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {
        startHack();
    }

    private static void startHack() throws InterruptedException {
        Random random = new Random();
        int hackResult = random.nextInt(100);
        char[] hackSymbols = new char[] {'-', '\\', '|', '/'};
        for (int i = 0; i < 5; i++) {
            for (char simbol : hackSymbols) {
                System.out.print(simbol + "\r");
                Thread.sleep(300);
            }
        }
        if (hackResult > 70) {
            System.out.println(ANSI_GREEN + "Access Granted!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Access Denied!" + ANSI_RESET);
        }
    }
}
