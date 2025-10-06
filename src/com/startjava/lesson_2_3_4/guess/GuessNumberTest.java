package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static final String YES = "yes";
    private static final String NO = "no";
    private static final Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        GuessNumber game = new GuessNumber(createPlayers());
        String answer = YES;
        do {
            if (YES.equals(answer)) {
                game.start();
            } else {
                System.out.println("Введите корректный ответ [yes / no]:");
            }
            System.out.println("Хотите продолжить играть? [yes/no]:");
            answer = CONSOLE.nextLine().trim().toLowerCase();
        } while (!NO.equals(answer));
    }

    private static Player[] createPlayers() {
        Player[] players = new Player[GuessNumber.PLAYER_COUNT];
        for (int i = 0; i < GuessNumber.PLAYER_COUNT; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            players[i] = new Player(CONSOLE.nextLine());
        }
        return players;
    }
}
