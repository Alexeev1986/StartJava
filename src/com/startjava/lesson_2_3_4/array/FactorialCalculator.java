package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
    public static void main(String[] args) {
        displayCalculateFactorials(calculateFactorials());
        displayCalculateFactorials(calculateFactorials((int[]) null));
        displayCalculateFactorials(calculateFactorials(8, 0, 9));
        displayCalculateFactorials(calculateFactorials(-3, 1, 7, 13));
    }

    private static String[] calculateFactorials(int... numbers) {
        if (numbers == null) {
            System.out.println("Ошибка: данные Null\n");
            return null;
        }
        if (numbers.length == 0) {
            System.out.println("Ошибка: пустой массив\n");
            return new String[0];
        }
        String[] factorialStr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                factorialStr[i] = "Ошибка: факториал " + numbers[i] + "! не определен";
            } else {
                factorialStr[i] = "";
                long resultFactorial = 1;
                for (int j = 1; j <= numbers[i]; j++) {
                    resultFactorial *= j;
                    factorialStr[i] += String.valueOf(j);
                    factorialStr[i] += (j < numbers[i]) ? " * " : " = ";
                }
                factorialStr[i] = numbers[i] + "! = " + factorialStr[i] + resultFactorial;
            }
        }
        return factorialStr;
    }

    private static void displayCalculateFactorials(String[] results) {
        if (results == null || results.length == 0) {
            return;
        }
        for (String result : results) {
            System.out.println(result);
        }
        System.out.println();
    }
}