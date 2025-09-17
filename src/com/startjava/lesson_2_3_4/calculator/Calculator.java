package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    private int number1;
    private int number2;
    private char operator;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber2() {
        return number2;
    }

    public boolean setExpression(String expression) {
        if (expression == null || expression.trim().isEmpty()) {
            System.out.println("Ошибка: пустое выражение");
            return false;
        }
        String[] expStr = expression.trim().split("\\s");
        if (expStr.length != 3) {
            System.out.println("Ошибка: выражение должно быть в формате - число оператор число");
            return false;
        }
        if (isIntager(expStr[0])) {
            setNumber1(Integer.parseInt(expStr[0]));
        } else {
            System.out.println("Ошибка: первый аргумент не является целым числом");
            return false;
        }
        if (!setOperator(expStr[1].charAt(0))) {
            System.out.println("Ошибка: оператор " + expStr[1] + " не поддерживается.");
            return false;
        }
        if (isIntager(expStr[2])) {
            setNumber2(Integer.parseInt(expStr[2]));
        } else {
            System.out.println("Ошибка: второй аргумент не является целым числом");
            return false;
        }
        return true;
    }

    public static boolean isIntager(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean setOperator(char operator) {
        if (operator == '+' ||
                operator == '-' ||
                operator == '*' ||
                operator == '/' ||
                operator == '^' ||
                operator == '%') {
            this.operator = operator;
            return true;
        }
        return false;
    }

    public double calculate(String expression) {
        Scanner console = new Scanner(System.in);
        while (!setExpression(expression)) {
            System.out.println("Введите выражение из трех аргументов, например, 2 ^ 10:");
            expression = console.nextLine();
        }
        double result = 0;
        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        } else if (operator == '/') {
            if (number2 == 0) {
                return Double.NaN;
            }
            result = (double) number1 / number2;
        } else if (operator == '%') {
            if (number2 == 0) {
                return Double.NaN;
            }
            result = Math.IEEEremainder(number1, number2);
        } else if (operator == '^') {
            if (number2 < 0) {
                return Double.NaN;
            }
            result = Math.pow(number1, number2);
        }
        return result;
    }

    public void printResult(Double result) {
        if (Double.isNaN(result)) {
            System.out.printf("%d %s %d = NAN%n", number1, operator, number2);
            return;
        }
        if (result == Math.floor(result)) {
            System.out.printf("%d %s %d = %.0f%n", number1, operator, number2, result);
        } else {
            System.out.printf("%d %s %d = %.3f%n", number1, operator, number2, result);
        }
    }
}