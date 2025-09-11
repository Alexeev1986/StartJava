package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayFilterExceeding {
    public static void main(String[] args) {
        float[] original = genArray();
        int index1 = -1;
        float[] filteredArr1 = filterByIndex(index1, original);
        displayIndexAndArrays(original,filteredArr1, index1);
        int index2 = 15;
        float[] filteredArr2 = filterByIndex(index2, original);
        displayIndexAndArrays(original,filteredArr2, index2);
        int index3 = 0;
        float[] filteredArr3 = filterByIndex(index3, original);
        displayIndexAndArrays(original,filteredArr3, index3);
        int index4 = 14;
        float[] filteredArr4 = filterByIndex(index4, original);
        displayIndexAndArrays(original,filteredArr4, index4);
    }

    private static float[] genArray() {
        Random random = new Random();
        float[] numbers = new float[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextFloat(0, 1);
        }
        return numbers;
    }

    private static float[] filterByIndex(int index, float[] original) {
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

    private static void displayIndexAndArrays(float[] origin, float[] filtered, int index) {
        if (index < 0 || index >= origin.length) {
            System.out.println("Ошибка индекс " + index +
                    " не попадает в допустимые границы [0, " + (origin.length - 1) + "]");
            return;
        }
        System.out.printf("\nЗначение по индексу (%d) = %.3f", index, origin[index]);
        System.out.println("\nОригинал массива : ");
        for (int i = 0; i < origin.length; i++) {
            if (i == 7) {
                System.out.printf(" %.3f \n", origin[i]);
            } else {
                System.out.printf(" %.3f ", origin[i]);
            }
        }
        System.out.println("\nИзмененный массив : ");
        for (int i = 0; i < filtered.length; i++) {
            if (i == 7) {
                System.out.printf(" %.3f \n", filtered[i]);
            } else {
                System.out.printf(" %.3f ", filtered[i]);
            }
        }
    }


}

