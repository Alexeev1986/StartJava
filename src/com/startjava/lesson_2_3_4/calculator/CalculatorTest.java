package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer = "yes";
        do {
            System.out.println("Введите выражение из трех аргументов, например, 2 ^ 10:");
            if (!calc.setExpression(console.nextLine())) {
                continue;
            }
            calc.printResult();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = console.next().trim().toLowerCase();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}