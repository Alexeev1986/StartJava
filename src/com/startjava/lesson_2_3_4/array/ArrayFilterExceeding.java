package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayFilterExceeding {
    public static void main(String[] args) {
        float[] original = genArray();
        int index = -1;
        float[] filteredArr = filterAboveThreshold(index, original);
        printComparison(original, filteredArr, index);
        index = 15;
        filteredArr = filterAboveThreshold(index, original);
        printComparison(original, filteredArr, index);
        index = 0;
        filteredArr = filterAboveThreshold(index, original);
        printComparison(original, filteredArr, index);
        index = 14;
        filteredArr = filterAboveThreshold(index, original);
        printComparison(original, filteredArr, index);
    }

    private static float[] genArray() {
        Random random = new Random();
        float[] numbers = new float[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextFloat(0, 1);
        }
        return numbers;
    }

    private static float[] filterAboveThreshold(int index, float[] original) {
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

    private static void printComparison(float[] origin, float[] filtered, int index) {
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
}

