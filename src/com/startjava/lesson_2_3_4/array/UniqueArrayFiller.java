package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class UniqueArrayFiller {
    public static void main(String[] args) {
        displayUniqueArrayFiller(arrayFilter(-30, -10, 23));
        displayUniqueArrayFiller(arrayFilter(10, 50, 10));
        displayUniqueArrayFiller(arrayFilter(-34, -34, 1));
        displayUniqueArrayFiller(arrayFilter(-1, 2, -3));
        displayUniqueArrayFiller(arrayFilter(5, -8, 2));
    }

    private static String arrayFilter(int left, int right, int countPerLine) {
        if (left > right) {
            return ("Ошибка: левая (" + left +
                    ") граница не может быть больше правой(" + right + ")");
        }
        if (countPerLine < 0) {
            return ("Ошибка: количество отображаемых" +
                    " элементов в строке не может быть отрицательным(" + countPerLine + ")");
        }
        int arraySize = (int) Math.round((right - left + 1) * 0.75);
        Random random = new Random();
        int[] arrUniqueNumbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            int temp;
            boolean isUnique;
            do {
                temp = random.nextInt(right - left + 1) + left;
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (arrUniqueNumbers[j] == temp) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
            arrUniqueNumbers[i] = temp;
        }
        int[] arrResult = bubbleSort(arrUniqueNumbers);
        StringBuilder sb = new StringBuilder();
        sb.append("Интервал (" + left + ", " + right +
                ") символов в строке " + countPerLine + "\n");
        int counter = 0;
        for (int i = 0; i < arrResult.length; i++) {
            sb.append(arrResult[i] + " ");
            counter++;
            if (counter == countPerLine) {
                sb.append("\n");
                counter = 0;
            }
        }
        return sb.toString();
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void displayUniqueArrayFiller(String uniqueArrayStr) {
        System.out.println(uniqueArrayStr);
    }
}
