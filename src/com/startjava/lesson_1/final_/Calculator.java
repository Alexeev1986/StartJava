package com.startjava.lesson_1.final_;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 1 число ");
        int number1 = console.nextInt();
        System.out.println("Введите мат действие (+, -, *, /, %, ^) ");
        char operation = console.next().charAt(0);
        System.out.println("Введите 2 число ");
        int number2 = console.nextInt();
        
        int result = 0;

        if (operation == '+') {
            result = number1 + number2;
        } else if (operation == '-') {
            result = number1 - number2;
        } else if (operation == '/') {
            result = number1 / number2;
        } else if (operation == '%') {
            result = number1 % number2;
        } else if (operation == '*') {
            result = number1 * number2;
        } else if (operation == '^') {
            result = number1;
            for (int i = 1; i < number2; i++) {
                result *= number1;
            }
        }
        System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
    }
}