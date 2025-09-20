package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int number1;
    private int number2;
    private char operator;

    public char getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        if (operator.equals("+") ||
                operator.equals("-") ||
                operator.equals("*") ||
                operator.equals("/") ||
                operator.equals("^") ||
                operator.equals("%")) {
            this.operator = operator.charAt(0);
        } else {
            System.out.println("Ошибка: оператор " + operator + " не поддерживается");
        }
    }

    public double calculate(String expression) {
        if (isCorrectExpression(expression)) {
            switch (getOperator()) {
                case '+' -> {
                    return number1 + number2;
                }
                case '-' -> {
                    return number1 - number2;
                }
                case '*' -> {
                    return number1 * number2;
                }
                case '/' -> {
                    if (number2 == 0) {
                        System.out.println("Ошибка: деление на ноль.");
                        return Double.NaN;
                    }
                    return (double) number1 / number2;
                }
                case '%' -> {
                    if (number2 == 0) {
                        System.out.println("Ошибка: деление на ноль.");
                        return Double.NaN;
                    }
                    return Math.IEEEremainder(number1, number2);
                }
                case '^' -> {
                    return Math.pow(number1, number2);
                }
                default -> {
                    return Double.NaN;
                }
            }
        } else {
            return Double.NaN;
        }
    }

    public boolean isCorrectExpression(String expression) {
        if (expression == null || expression.trim().isEmpty()) {
            System.out.println("Ошибка: пустое выражение");
            return false;
        }
        String[] parts = expression.trim().split("\\s");
        if (parts.length != 3) {
            System.out.println("Ошибка: выражение должно быть в формате - число оператор число");
            return false;
        }
        try {
            number1 = Integer.parseInt(parts[0]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: первый аргумент не является целым числом");
            return false;
        }
        try {
            number2 = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: второй аргумент не является целым числом");
            return false;
        }
        return true;
    }
}