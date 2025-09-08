package com.startjava.lesson_2_3_4.array;

public class CalculateFactorials {
    public static void calculateFactorials(int... numbers) {
        if (numbers == null) {
            System.out.println("Ошибка: данные Null");
            return;
        }
        if (numbers.length == 0) {
            System.out.println("Ошибка: пустой массив");
            return;
        }
        System.out.print("Исходные данные: [");
        int len = numbers.length - 1;
        int count = 0;
        for (int temp : numbers) {
            System.out.print(temp + (count != len ? "," : ""));
            count++;
        }
        System.out.print("]\n");
        String[] factorialStr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                factorialStr[i] = numbers[i] == 0 ? " = 1" : null;
            } else {
                factorialStr[i] = "";
                long resultFactorial = 1;
                for (int j = 1; j <= numbers[i]; j++) {
                    factorialStr[i] += String.valueOf(j);
                    factorialStr[i] += j == numbers[i] ? " = " : " * ";
                    resultFactorial *= j;
                }
                factorialStr[i] += String.valueOf(resultFactorial);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(factorialStr[i] == null
                    ? "Ошибка: факториал " + numbers[i] + "! не определен"
                    : numbers[i] + "! = " + factorialStr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        calculateFactorials();
        calculateFactorials((int[]) null);
        calculateFactorials(8, 0, 9);
        calculateFactorials(-3, 1, 7, 13);
        calculateFactorials(-22, -0);
    }
}

