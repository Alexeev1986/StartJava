package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {

    private static final String YES = "yes";
    private static final String NO = "no";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Калькулятор запущен.");
        String answer = "yes";
        do {
            if (YES.equals(answer)) {
                System.out.println("Введите выражение из трех аргументов, например, 2 ^ 10:");
                try {
                    String[] expression = inputExpression(console.nextLine());
                    double result = Calculator.calculate(expression);
                    printResult(printExpression(expression), result);
                } catch (InvalidExpressionException | InvalidNumberException |
                         UnsupportedOperatorException | ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Введите корректный ответ [yes / no]:");
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = console.nextLine().trim().toLowerCase();
        } while (!NO.equals(answer));
    }

    private static String[] inputExpression(String expression) {
        if (expression == null || expression.isBlank()) {
            throw new InvalidExpressionException("Ошибка: пустое выражение");
        }
        String[] parts = expression.trim().split("\\s+");
        if (parts.length != Calculator.PART_COUNT) {
            throw new InvalidExpressionException("Ошибка: выражение должно быть" +
                    " в формате - число оператор число");
        }
        return parts;
    }

    private static String printExpression(String[] parts) {
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            sb.append(part).append(" ");
        }
        return sb.toString();
    }

    private static void printResult(String expression, double result) {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(expression + " = " + df.format(result));
    }
}