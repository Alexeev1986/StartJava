package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "yes";
        String expression;
        double result;
        System.out.println("Калькулятор запущен.");
        do {
            System.out.println("Введите выражение из трех аргументов, например, 2 ^ 10:");
            expression = console.nextLine();
            result = calc.calculate(expression);
            if (Double.isNaN(result)) {
                if ((calc.getOperator() == '/' || calc.getOperator() == '%') && calc.getNumber2() == 0) {
                    System.out.println("Ошибка: деление на ноль.");
                }
                if (calc.getOperator() == '^' && calc.getNumber2() < 0) {
                    System.out.println("Ошибка: не допустимая математическая операция");
                }
            } else {
                System.out.printf("%d %s %d = ", calc.getNumber1(), calc.getOperator(), calc.getNumber2());
                System.out.print(formatResult(result) + "\n");
            }
            do {
                if (answer.equals("yes")) {
                    System.out.println("Хотите продолжить вычисления? [yes/no]:");
                } else {
                    System.out.println("Введите корректный ответ [yes/no]:");
                }
                answer = console.nextLine().trim().toLowerCase();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }

    private static String formatResult(double value) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
        df.setMinimumFractionDigits(0);
        df.setGroupingUsed(false);
        return df.format(value);
    }
}