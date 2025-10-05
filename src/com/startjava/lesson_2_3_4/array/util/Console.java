package com.startjava.lesson_2_3_4.array.util;

import java.util.Arrays;
import java.util.Random;

public class Console {
    private Console() {
    }

    public static void displayHackResult(int result) {
        String ansiRed = "\u001B[31m";
        String ansiGreen = "\u001B[32m";
        String ansiReset = "\u001B[0m";
        System.out.println(result > 70
                ? ansiGreen + "Access Granted!"
                : ansiRed + "Access Denied!");
        System.out.println(ansiReset);
    }

    public static void printMessageArray(int[] arr, String massage) {
        if (arr == null) {
            System.out.println("\nnull (ошибка в данных)\n");
            return;
        }
        if (arr.length == 0) {
            System.out.println("\nпустой массив (нет данных)\n");
            return;
        }
        System.out.print(massage + Arrays.toString(arr));
        System.out.println();
    }

    public static void printSpin(int rotationsCount) throws InterruptedException {
        char[] spins = new char[] {'-', '\\', '|', '/'};
        for (int i = 0; i < spins.length * rotationsCount; i++) {
            System.out.print("Hacking: " + spins[i % 4] + "\r");
            Thread.sleep(300);
        }
    }

    public static void println(String triangle) {
        System.out.println(triangle);
    }

    public static void typewriterPrinter(String text) throws InterruptedException {
        if (text == null) {
            System.out.println("\nОшибка: данные Null");
            return;
        }
        if (text.isEmpty()) {
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

    public static void printArrayBlock(int[] numbers, int left, int right, int countPerLine) {
        if (left > right) {
            System.out.println("Ошибка: левая (" + left +
                    ") граница не может быть больше правой(" + right + ")");
            System.out.println();
            return;
        }
        if (left == right) {
            System.out.println("Ошибка: длина массива должна быть > 0");
            System.out.println();
            return;
        }
        if (countPerLine < 0) {
            System.out.println("Ошибка: количество отображаемых" +
                    " элементов в строке не может быть отрицательным(" + countPerLine + ")");
            System.out.println();
            return;
        }
        if (numbers == null || numbers.length == 0) {
            System.out.println("Ошибка: пустой массив.");
            System.out.println();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Интервал (" + left + ", " + right +
                ") символов в строке " + countPerLine + "\n");
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i] + " ");
            counter++;
            if (counter == countPerLine) {
                sb.append("\n");
                counter = 0;
            }
        }
        System.out.println(sb.toString());
    }

    public static void printArraysWithIndexValue(float[] origin, float[] filtered, int index) {
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

    public static void printFactorialsExpressions(int[] numbers, long[] factorials) {
        if (numbers == null) {
            System.out.println("Ошибка: данные Null\n");
            return;
        }
        if (numbers.length == 0) {
            System.out.println("Ошибка: пустой массив\n");
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println("Ошибка: факториал " + numbers[i] + "! не определен");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(numbers[i]).append("! = ");
                for (int j = 1; j <= numbers[i]; j++) {
                    sb.append(j);
                    if (j < numbers[i]) {
                        sb.append(" * ");
                    }
                }
                sb.append(" = ").append(factorials[i]);
                String expression = sb.toString();
                System.out.println(expression);
            }
        }
        System.out.println();
    }

    private static String buildFactorialExpression(int number, long factorial) {
        if (number == 0 || number == 1) {
            return number + "! = " + factorial;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(number).append("! = ");
        for (int i = 1; i <= number; i++) {
            sb.append(i);
            if (i < number) {
                sb.append(" * ");
            }
        }
        sb.append(" = ").append(factorial);
        return sb.toString();
    }
}

