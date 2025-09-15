package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class UniqueArrayFiller {
    public static void main(String[] args) {
        printSortedUniqueNumbers(generateUniqueNumbers(-30, -10), -30, -10, 23);
        printSortedUniqueNumbers(generateUniqueNumbers(10, 50), 10, 50, 10);
        printSortedUniqueNumbers(generateUniqueNumbers(-34, -34),-34, -34, 1);
        printSortedUniqueNumbers(generateUniqueNumbers(-1, 2), -1, 2, -3);
        printSortedUniqueNumbers(generateUniqueNumbers(5, -8),5,-8, 2);
    }

    private static int[] generateUniqueNumbers(int left, int right) {
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
        Arrays.sort(uniqueNumbers);
        return uniqueNumbers;
    }

    private static void printSortedUniqueNumbers(int[] numbers, int left, int right, int countPerLine) {
        if (left > right) {
            System.out.println("Ошибка: левая (" + left + ") граница не может быть больше правой(" + right + ")");
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
}
