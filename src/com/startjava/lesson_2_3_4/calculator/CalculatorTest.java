package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {

    public static final String YES = "yes";
    public static final String NO = "no";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Калькулятор запущен.");
        String answer = "yes";
        do {
            if (YES.equals(answer)) {
                System.out.println("Введите выражение из трех аргументов, например, 2 ^ 10:");
                String expression = console.nextLine();
                try {
                    double result = Calculator.calculate(expression);
                    printResult(Calculator.trimExpression(), result);
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

    public static void printResult(String expression, double result) {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(expression + " = " + df.format(result));
    }
}