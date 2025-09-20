package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Калькулятор запущен.");
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.println("Введите выражение из трех аргументов, например, 2 ^ 10:");
                String expression = console.nextLine();
                double result = calc.calculate(expression);
                if (!Double.isNaN(result)) {
                    DecimalFormat df = new DecimalFormat("#.###");
                    System.out.println(expression + " = " + df.format(result));
                }
            }
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = console.nextLine().trim().toLowerCase();
                while (!"yes".equals(answer) && !"no".equals(answer)) {
                    System.out.println("Введите корректный ответ [yes / no]:");
                    answer = console.nextLine().trim().toLowerCase();
                }
        } while (!"no".equals(answer));
    }

    private static String formatResult(double value) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
        df.setMinimumFractionDigits(0);
        df.setGroupingUsed(false);
        return df.format(value);
    }
}