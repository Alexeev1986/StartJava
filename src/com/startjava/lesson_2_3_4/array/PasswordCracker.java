package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class PasswordCracker {
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {
        displayPasswordCracker(hackPassword());
    }

    private static int hackPassword() throws InterruptedException {
        Random random = new Random();
        char[] spins = new char[] {'-', '\\', '|', '/'};
        for (int i = 0; i < 12; i++) {
            System.out.print("Hacking: " + spins[i % 4] + "\r");
            Thread.sleep(300);
        }
        return random.nextInt(100);
    }

    private static void displayPasswordCracker(int result) {
        System.out.println(result > 70
                ? ANSI_GREEN + "Access Granted!" + ANSI_RESET
                : ANSI_RED + "Access Denied!" + ANSI_RESET);
    }
}
