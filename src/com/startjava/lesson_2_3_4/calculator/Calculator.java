package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int number1;
    private int number2;
    private char operator;

    public char getOperator() {
        return operator;
    }

    public double calculate(String expression) {
        if (!isCorrectExpression(expression)) {
            return Double.NaN;
        }
        return switch (getOperator()) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            case '/', '%' -> {
                if (number2 == 0) {
                    System.out.println("Ошибка: деление на ноль.");
                    yield Double.NaN;
                }
                if (operator == '/') {
                    yield (double) number1 / number2;
                } else {
                    yield Math.IEEEremainder(number1, number2);
                }
            }
            case '^' -> Math.pow(number1, number2);
            default -> {
                System.out.println("Оператор " + operator + " не поддерживается");
                yield Double.NaN;
            }
        };
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
        operator = (parts[1].charAt(0));
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