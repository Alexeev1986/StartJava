package lesson2;

public class Calculator {
    private int number1;
    private int number2;
    private float result;
    private char operator;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void startCalculation() {
        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        } else if (operator == '/') {
            if (number2 == 0) {
                System.out.println("Ошибка! деление на ноль!");
            } else {
                result = (float) number1 / number2;
            }
        } else if (operator == '%') {
            if (number2 == 0) {
                System.out.println("Ошибка! деление на ноль!");
            } else {
                result = number1 % number2;
            }
        } else if (operator == '^') {
            result = 1;
            int base = number1;
            int exponent = number2;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        }
        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    }
}