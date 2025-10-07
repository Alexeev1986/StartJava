package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static final String YES = "yes";
    private static final String NO = "no";

    public static void main(String[] args) throws InterruptedException {
        Scanner console = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createPlayers());
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

    private static Player[] createPlayers() {
        Player[] players = new Player[GuessNumber.PLAYER_COUNT];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < GuessNumber.PLAYER_COUNT; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            players[i] = new Player(console.nextLine());
        }
        return players;
    }
}
