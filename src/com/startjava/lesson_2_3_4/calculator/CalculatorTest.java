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
        System.out.println("Калькулятор включен.");
        do {
            do {
                System.out.println("Введите выражение из трех аргументов, например, 2 ^ 10:");
                expression = console.nextLine();
            } while (!isCorrectExpression(expression, calc));
            result = calc.calculate(calc.getNumber1(), calc.getNumber2(), calc.getOperator());
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

    private static boolean isCorrectExpression(String expression, Calculator calc) {
        if (expression == null || expression.trim().isEmpty()) {
            System.out.println("Ошибка: пустое выражение");
            return false;
        }
        String[] parts = expression.trim().split("\\s");
        if (parts.length != 3) {
            System.out.println("Ошибка: выражение должно быть в формате - число оператор число");
            return false;
        }
        if (!isInteger(parts[0])) {
            System.out.println("Ошибка: первый аргумент не является целым числом");
            return false;
        } else {
            calc.setNumber1(Integer.parseInt(parts[0]));
        }
        if (!isOperator(parts[1])) {
            System.out.println("Ошибка: оператор " + parts[1] + " не поддерживается.");
            return false;
        } else {
            calc.setOperator(parts[1].charAt(0));
        }
        if (!isInteger(parts[2])) {
            System.out.println("Ошибка: второй аргумент не является целым числом");
            return false;
        } else {
            calc.setNumber2(Integer.parseInt(parts[2]));
        }
        return true;
    }

    private static boolean isOperator(String operator) {
        if (operator.equals("+") ||
                operator.equals("-") ||
                operator.equals("*") ||
                operator.equals("/") ||
                operator.equals("^") ||
                operator.equals("%")) {
            return true;
        }
        return false;
    }

    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String formatResult(double value) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
        df.setMinimumFractionDigits(0);
        df.setGroupingUsed(false);
        return df.format(value);
    }
}