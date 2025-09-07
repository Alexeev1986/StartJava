package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player();
        player1.setName(console.next());
        System.out.print("\nВведите имя второго игрока: ");
        Player player2 = new Player();
        player2.setName(console.next());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer;
        do {
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = console.next().trim();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
