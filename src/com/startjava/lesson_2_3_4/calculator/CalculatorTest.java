package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "yes";
        System.out.println("Калькулятор запущен.");
        while (answer.equals("yes")) {
            System.out.println("Введите выражение из трех аргументов, например, 2 ^ 10:");
            String expression = console.nextLine();
            double result = calc.calculate(expression);
            if (!Double.isNaN(result)) {
                DecimalFormat df = new DecimalFormat("#.###");
                System.out.println(expression + " = " + df.format(result));
            }
            do {
                if (answer.equals("yes")) {
                    System.out.println("Хотите продолжить вычисления? [yes/no]:");
                } else {
                    System.out.println("Введите корректный ответ [yes/no]:");
                }
                answer = console.nextLine().trim().toLowerCase();
            } while (!answer.equals("yes") && !answer.equals("no"));
        };
    }

    private static String formatResult(double value) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
        df.setMinimumFractionDigits(0);
        df.setGroupingUsed(false);
        return df.format(value);
    }
}