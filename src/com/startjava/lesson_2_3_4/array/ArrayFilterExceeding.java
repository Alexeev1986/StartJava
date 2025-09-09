package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayFilterExceeding {
    public static void main(String[] args) {
        float[] original = genArray();
        testFilter(original, -1);
        testFilter(original, 15);
        testFilter(original, 0);
        testFilter(original, 14);
    }

    public static void testFilter(float[] original, int index) {
        float[] copy = original.clone();
        filterByIndex(index, copy);
        printIndexAndArrays(original, copy, index);
    }

    public static float[] genArray() {
        Random random = new Random();
        float[] numbers = new float[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextFloat(0, 1);
        }
        return numbers;
    }

    public static void filterByIndex(int index, float[] arr) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Ошибка индекс " + index +
                    " не попадает в допустимые границы [0, " + (arr.length - 1) + "]");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                arr[i] = 0.0f;
            }
        }
    }

    public static void printIndexAndArrays(float[] origin, float[] filtered, int index) {
        if (index < 0 || index >= origin.length) {
            return;
        }
        System.out.printf("\nЗначение по индексу (%d) = %.3f", index, origin[index]);
        System.out.println("\nОригинал массива : ");
        printArray(origin);
        System.out.println("\nИзмененный массив : ");
        printArray(filtered);
    }

    public static void printArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 7) {
                System.out.printf(" %.3f \n", arr[i]);
            } else {
                System.out.printf(" %.3f ", arr[i]);
            }
        }
    }
}

