package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class PasswordGuesser {
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {
        displayHackResult(hackPassword());
    }

    private static int hackPassword() throws InterruptedException {
        Random random = new Random();
        char[] spinner = new char[] {'-', '\\', '|', '/','-', '\\', '|', '/','-', '\\', '|', '/'};
        for (int i = 0; i < 12; i++) {
            System.out.print(spinner[i] + "\r");
            Thread.sleep(300);
        }
        return random.nextInt(100);
    }

    private static void displayHackResult(int result) {
        if (result > 70) {
            System.out.println(ANSI_GREEN + "Access Granted!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Access Denied!" + ANSI_RESET);
        }
    }
}
