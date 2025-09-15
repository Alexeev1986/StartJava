package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        int[] numbers = new int[0];
        long[] factorials = calculateFactorials(numbers);
        printCalculatedFactorials(numbers, factorials);
        numbers = null;
        factorials = calculateFactorials(numbers);
        printCalculatedFactorials(numbers, factorials);
        numbers = new int[] {8, 0, 9};
        factorials = calculateFactorials(numbers);
        printCalculatedFactorials(numbers, factorials);
        numbers = new int[]{-3, 1, 7, 13};
        factorials = calculateFactorials(numbers);
        printCalculatedFactorials(numbers, factorials);
        numbers = new int[]{-22, -0};
        factorials = calculateFactorials(numbers);
        printCalculatedFactorials(numbers, factorials);
    }

    private static long[] calculateFactorials(int... numbers) {
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

    private static void printCalculatedFactorials(int[] numbers, long[] factorials) {
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
                String expression = buildFactorialExpression(i, factorials[i]);
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