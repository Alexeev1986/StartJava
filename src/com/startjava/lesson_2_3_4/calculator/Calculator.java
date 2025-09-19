package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int number1;
    private int number2;
    private char operator;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double calculate(String expression) {
        if (isCorrectExpression(expression)) {
            String[] parts = expression.trim().split("\\s");
            setNumber1(Integer.parseInt(parts[0]));
            setNumber2(Integer.parseInt(parts[2]));
            setOperator(parts[1].charAt(0));
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
        if (!isInteger(parts[0])) {
            System.out.println("Ошибка: первый аргумент не является целым числом");
            return false;
        }
        if (!isOperator(parts[1])) {
            System.out.println("Ошибка: оператор " + parts[1] + " не поддерживается.");
            return false;
        }
        if (!isInteger(parts[2])) {
            System.out.println("Ошибка: второй аргумент не является целым числом");
            return false;
        }
        return true;
    }

    private boolean isOperator(String operator) {
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

    private boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}