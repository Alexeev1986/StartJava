package com.startjava.lesson_2_3_4.array.util;

import java.util.Random;

public class Arrays {
    private Arrays() {
    }

    public static long[] calculateFactorials(int... numbers) {
        if (numbers == null) {
            return null;
        }
        if (numbers.length == 0) {
            return new long[0];
        }
        long[] factorials = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                long resultFactorial = 1;
                for (int j = 1; j <= numbers[i]; j++) {
                    resultFactorial *= j;
                }
                factorials[i] = resultFactorial;
            }
        }
        return factorials;
    }

    public static String createTriangle(char left, char right, boolean ascending) {
        if (left > right) {
            System.out.printf("Ошибка: левая граница (%d) > правой (%d).\n", (int) left, (int) right);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int indent = right - left;
        char start = ascending ? right : left;
        char end = ascending ? left : right;
        int step = ascending ? -1 : 1;
        for (char i = start; ascending ? i >= end : i <= end; i += step) {
            sb.append(" ".repeat(indent)).append(String.valueOf(i).repeat(count)).append("\n");
            indent -= 1;
            count += 2;
        }
        return sb.toString();
    }

    public static float[] generateArray() {
        Random random = new Random();
        float[] numbers = new float[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextFloat(0, 1);
        }
        return numbers;
    }

    public static int[] generateAndSortUniqueNumbers(int left, int right) {
        if (left > right) {
            return null;
        }
        if (left == right) {
            return new int[0];
        }

        int arraySize = (int) Math.round((right - left) * 0.75);
        Random random = new Random();
        int[] uniqueNumbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            int candidate;
            boolean isUnique;
            do {
                candidate = random.nextInt(left, right + 1);
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (uniqueNumbers[j] == candidate) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
            uniqueNumbers[i] = candidate;
        }
        java.util.Arrays.sort(uniqueNumbers);
        return uniqueNumbers;
    }

    public static int hackPassword() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static float[] filterAboveThreshold(int index, float[] original) {
        float[] filteredArr = original.clone();
        if (index < 0 || index >= filteredArr.length) {
            return new float[0];
        }
        for (int i = 0; i < filteredArr.length; i++) {
            if (filteredArr[i] > filteredArr[index]) {
                filteredArr[i] = 0.0f;
            }
        }
        return filteredArr;
    }

    public static int[] reverseTransactions(int[] transactions) {
        if (transactions == null) {
            return null;
        }
        if (transactions.length == 0) {
            return new int[0];
        }
        int[] reversed = new int[transactions.length];
        int index = transactions.length;

        for (int value : transactions) {
            reversed[--index] = value;
        }
        return reversed;
    }

    public static String toUpperCaseBetweenShortestAndLongestWord(String text) {
        if (text == null) {
            return null;
        }
        if (text.length() == 0) {
            return "";
        }
        char[] simbols = new char[text.length()];
        int maxWord = 0;
        int minWord = 10;
        int maxPos = 0;
        int minPos = 0;
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            simbols[i] = text.charAt(i);
            if (Character.isLetter(simbols[i]) && i != text.length() - 1) {
                counter++;
            } else {
                if (maxWord < counter) {
                    maxWord = counter;
                    maxPos = i;
                }
                if (minWord > counter && counter != 0) {
                    minWord = counter;
                    minPos = i - counter - 1;
                }
                counter = 0;
            }
        }
        return (toUpperCaseRange(simbols, minPos, maxPos));
    }

    private static String toUpperCaseRange(char[] offer, int minPos, int maxPos) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < offer.length; i++) {
            if (i > minPos && i < maxPos) {
                sb.append(Character.toUpperCase(offer[i]));
            } else {
                sb.append(offer[i]);
            }
        }
        return (sb.toString());
    }
}
