package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static final int PART_COUNT = 3;

    public static double calculate(String expression) {
        if (expression == null || expression.isBlank()) {
            throw new InvalidExpressionException("Ошибка: пустое выражение");
        }
        String[] parts = expression.trim().split("\\s+");
        if (parts.length != PART_COUNT) {
            throw new InvalidExpressionException("Ошибка: выражение должно быть" +
                " в формате - число оператор число");
        }
        if (parts[1].length() != 1) {
            throw new UnsupportedOperatorException("Оператор " + parts[1] + " не поддерживается");
        }
        char operator = (parts[1].charAt(0));
        int number1 = parseNumber(parts[0], "первый");
        int number2 = parseNumber(parts[2], "второй");
        return switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            case '/', '%' -> {
                if (number2 == 0) {
                    throw new ArithmeticException("Ошибка: деление на ноль.");
                } else {
                    yield operator == '/' 
                    ? ( double) number1 / number2 
                    : Math.IEEEremainder(number1, number2);
                }
            }
            case '^' -> Math.pow(number1, number2);
            default -> throw new UnsupportedOperatorException("Оператор " + operator + " не поддерживается");
        };
    }

    private static int parseNumber(String str, String argName) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("Ошибка: " + argName + " аргумент не является целым числом");
        }
    }
}