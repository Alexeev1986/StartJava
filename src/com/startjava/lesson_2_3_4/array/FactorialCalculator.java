package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        int[] numbers = new int[0];
        long[] factorials = calculateFactorials(numbers);
        displayCalculateFactorials(numbers, factorials);
        numbers = null;
        factorials = calculateFactorials(numbers);
        displayCalculateFactorials(numbers, factorials);
        numbers = new int[] {8, 0, 9};
        factorials = calculateFactorials(numbers);
        displayCalculateFactorials(numbers, factorials);
        numbers = new int []{-3, 1, 7, 13};
        factorials = calculateFactorials(numbers);
        displayCalculateFactorials(numbers, factorials);
    }

    private static long[] calculateFactorials(int... numbers) {
        if (numbers == null) {
            return null;
        }
        if (numbers.length == 0) {
            return new long[0];
        }
        long[] factorialLng = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                factorialLng[i] = 0;
            } else {
                long resultFactorial = 1;
                for (int j = 1; j <= numbers[i]; j++) {
                    resultFactorial *= j;
                }
                factorialLng[i] = resultFactorial;
            }
        }
        return factorialLng;
    }

    private static void displayCalculateFactorials(int[] numbers, long[] factorials) {
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
                    if (numbers[i] != 1) {
                        sb.append(j);
                        sb.append((j < numbers[i]) ? " * " : " = ");
                    }
                }
                sb.append(factorials[i]);
                System.out.println(sb);
            }
        }
    }
}