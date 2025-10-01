package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static final int PART_COUNT = 3;
    private static String[] parts;

    public static double calculate(String expression) {
        extractExpressionParts(expression);
        char operator = extractOperator(parts[1]);
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
            default -> throw new UnsupportedOperatorException("Ошибка: оператор " + operator + " не поддерживается");
        };
    }

    public static String trimExpression() {
        return parts[0] + " " + parts[1] + " " + parts[2];
    }

    private static void extractExpressionParts(String expression) {
        if (expression == null || expression.isBlank()) {
            throw new InvalidExpressionException("Ошибка: пустое выражение");
        }
        parts = expression.trim().split("\\s+");
        if (parts.length != PART_COUNT) {
            throw new InvalidExpressionException("Ошибка: выражение должно быть" +
                    " в формате - число оператор число");
        }
    }

    private static char extractOperator(String operator) {
        if (operator.length() != 1) {
            throw new UnsupportedOperatorException("Оператор " + operator + " не поддерживается");
        }
        return operator.charAt(0);
    }

    private static int parseNumber(String arg, String argName) {
        try {
            return Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("Ошибка: " + argName + " аргумент не является целым числом");
        }
    }
}