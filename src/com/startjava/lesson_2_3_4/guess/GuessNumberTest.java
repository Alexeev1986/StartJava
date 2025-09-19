package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player();
        player1.setName(console.nextLine());
        System.out.print("\nВведите имя второго игрока: ");
        Player player2 = new Player();
        player2.setName(console.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
        do {
            game.start();
            do {
                if (answer.equals("yes")) {
                    System.out.println("Хотите продолжить играть? [yes/no]:");
                } else {
                    System.out.println("Введите корректный ответ [yes/no]:");
                }
                answer = console.nextLine().trim().toLowerCase();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
