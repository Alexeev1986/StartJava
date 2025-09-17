package com.startjava.lesson_2_3_4.hangman;

import java.util.Scanner;

public class HangmanGameMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        HangmanGame game = new HangmanGame();
        String answer;
        do {
            game.start();
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = console.nextLine().trim().toLowerCase();
            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Введите корректный ответ [yes / no]:");
                answer = console.nextLine().trim().toLowerCase();
            }
        } while (answer.equals("yes"));
    }
}
