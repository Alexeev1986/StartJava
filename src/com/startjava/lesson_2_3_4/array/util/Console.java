package com.startjava.lesson_2_3_4.array.util;

import java.util.Arrays;
import java.util.Random;

public class Console {
    private Console() {
    }

    public static void displayHackResult(int result) {
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RESET = "\u001B[0m";
        System.out.println(result > 70
                ? ANSI_GREEN + "Access Granted!"
                : ANSI_RED + "Access Denied!");
        System.out.println(ANSI_RESET);
    }

    public static void displayTransactions(int[] reversed) {
        if (reversed == null) {
            System.out.println("\nnull (ошибка в данных)\n");
            return;
        }
        if (reversed.length == 0) {
            System.out.println("\nпустой массив (нет данных)\n");
            return;
        }
        int[] original = new int[reversed.length];
        int index = reversed.length;

        for (int value : reversed) {
            original[--index] = value;
        }
        System.out.print("Исходные транзакции: " + Arrays.toString(original));
        System.out.print("\nВ обратном  порядке: " + Arrays.toString(reversed));
        System.out.println();
    }

    public static void displayTriangle(String triangle) {
        System.out.println(triangle);
    }

    public static void displayTypewriter(String text) throws InterruptedException {
        if (text == null) {
            System.out.println("\nОшибка: данные Null");
            return;
        }
        if (text.length() == 0) {
            System.out.println("\nОшибка: пустая строка");
            return;
        }
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            Thread.sleep(random.nextInt(50, 200));
        }
    }

    public static void displayUniqueArrayFiller(String uniqueArrayStr) {
        System.out.println(uniqueArrayStr);
    }

    public static void printComparison(float[] origin, float[] filtered, int index) {
        if (index < 0 || index >= origin.length) {
            System.out.println("Ошибка индекс " + index +
                    " не попадает в допустимые границы [0, " + (origin.length - 1) + "]");
            return;
        }
        System.out.printf("\nЗначение по индексу (%d) = %.3f", index, origin[index]);
        System.out.println("\nОригинал массива : ");
        printFormattedFloats(origin);
        System.out.println("\nИзмененный массив : ");
        printFormattedFloats(filtered);
    }

    private static void printFormattedFloats(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 7) {
                System.out.printf(" %.3f \n", arr[i]);
            } else {
                System.out.printf(" %.3f ", arr[i]);
            }
        }
    }

    public static void printCalculatedFactorials(int[] numbers, long[] factorials) {
        if (numbers == null) {
            System.out.println("Ошибка: данные Null\n");
            return;
        }
        if (numbers.length == 0) {
            System.out.println("Ошибка: пустой массив\n");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println("Ошибка: факториал " + numbers[i] + "! не определен");
            } else {
                sb.append(numbers[i]).append("! = ");
                for (int j = 1; j <= numbers[i]; j++) {
                    if (numbers[i] != 1) {
                        sb.append(j);
                        sb.append((j < numbers[i]) ? " * " : " = ");
                    }
                }
                sb.append(factorials[i]);
                System.out.println(sb);
                sb.setLength(0);
            }
        }
    }
}

