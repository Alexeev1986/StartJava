package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int number1;
    private int number2;
    private char operator;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber2() {
        return number2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }

    public double calculate(int number1, int number2, char operator) {
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
}