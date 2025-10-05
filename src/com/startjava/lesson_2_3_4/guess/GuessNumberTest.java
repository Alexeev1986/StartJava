package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static final String YES = "yes";
    public static final String NO = "no";

    public static void main(String[] args) throws InterruptedException {
        Scanner console = new Scanner(System.in);
        Player[] players = new Player[3];
        for (int i = 0; i < GuessNumber.PLAYER_COUNT; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            players[i] = new Player(console.nextLine());
        }
        GuessNumber game = new GuessNumber(players);
        String answer = YES;
        do {
            if (YES.equals(answer)) {
                game.start();
            } else {
                System.out.println("Введите корректный ответ [yes / no]:");
            }
            System.out.println("Хотите продолжить играть? [yes/no]:");
            answer = console.nextLine().trim().toLowerCase();
        } while (!NO.equals(answer));
    }
}
