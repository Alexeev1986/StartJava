package lesson2;

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

    public boolean setOperator(char operator) {
        if (operator == '+' ||
                operator == '-' ||
                operator == '*' ||
                operator == '/' ||
                operator == '^' ||
                operator == '%') {
            this.operator = operator;
            return true;
        } else {
            return false;
        }
    }

    public void calculate() {
        float result = 0;
        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        } else if (operator == '/') {
            result = (float) number1 / number2;
        } else if (operator == '%') {
            result = number1 % number2;
        } else if (operator == '^') {
            result = 1;
            for (int i = 0; i < number2; i++) {
                result *= number1;
            }
        }
        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    }
}