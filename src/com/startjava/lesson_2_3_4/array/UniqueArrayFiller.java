package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class UniqueArrayFiller {
    public static void main(String[] args) {
        printSortedUniqueNumbers(generateUniqueNumbers(-30, -10, 23));
        printSortedUniqueNumbers(generateUniqueNumbers(10, 50, 10));
        printSortedUniqueNumbers(generateUniqueNumbers(-34, -34, 1));
        printSortedUniqueNumbers(generateUniqueNumbers(-1, 2, -3));
        printSortedUniqueNumbers(generateUniqueNumbers(5, -8, 2));
    }

    private static String generateUniqueNumbers(int left, int right, int countPerLine) {
        if (left > right) {
            return ("Ошибка: левая (" + left +
                    ") граница не может быть больше правой(" + right + ")");
        }
        if (left == right) {
            return ("Ошибка: длина массива должна быть > 0");
        }
        if (countPerLine < 0) {
            return ("Ошибка: количество отображаемых" +
                    " элементов в строке не может быть отрицательным(" + countPerLine + ")");
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
        StringBuilder sb = new StringBuilder();
        sb.append("Интервал (" + left + ", " + right +
                ") символов в строке " + countPerLine + "\n");
        int counter = 0;
        for (int i = 0; i < uniqueNumbers.length; i++) {
            sb.append(uniqueNumbers[i] + " ");
            counter++;
            if (counter == countPerLine) {
                sb.append("\n");
                counter = 0;
            }
        }
        return sb.toString();
    }

    public static void printSortedUniqueNumbers(String uniqueArrayStr) {
        System.out.println(uniqueArrayStr);
    }
}
