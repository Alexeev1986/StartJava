package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static final int PART_COUNT = 3;

    public static double calculate(String[] parts) {
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
                }
                yield operator == '/'
                ? ( double) number1 / number2
                : Math.IEEEremainder(number1, number2);
            }
            case '^' -> Math.pow(number1, number2);
            default -> throw new UnsupportedOperatorException("Ошибка: оператор " +
                    operator + " не поддерживается");
        };
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