package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer;
        do {
            System.out.println("Введите выражение из трех аргументов, например, 2 ^ 10:");
            calc.printResult(calc.calculate(console.nextLine()));
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = console.nextLine().trim().toLowerCase();
            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Введите корректный ответ [yes / no]:");
                answer = console.nextLine().trim().toLowerCase();
            }
        } while (answer.equals("yes"));
    }
}