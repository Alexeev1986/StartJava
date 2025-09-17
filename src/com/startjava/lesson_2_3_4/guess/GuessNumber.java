package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(1, 100);
        System.out.println(targetNumber);
        boolean gameOver = false;
        player1.setAttempts(0);
        player2.setAttempts(0);
        while (!gameOver) {
            if (palayerMadeAttept(player1, targetNumber)) {
                break;
            }
            if (palayerMadeAttept(player2, targetNumber)) {
                break;
            }
            if (player1.getAttemptsCount() == 3) {
                gameOver = true;
            }
        }
        if (gameOver == true) {
            System.out.println("Игра окончена победителей нет!");
        }

    }
    public boolean palayerMadeAttept(Player player, int targetNumber) {
        Scanner console = new Scanner(System.in);
        System.out.print("\nЧисло вводит " + player.getName() + ":");
        while(!player.setGuess(console.nextInt())) {
            System.out.println("Число должно входить в отрезок [1, 100].\n" +
                    "Попробуйте еще раз:");
            System.out.print("\nЧисло вводит " + player.getName() + ":");
        }
        return isGuessed(player, targetNumber);
    }

    public boolean isGuessed(Player player, int targetNumber) {
        if (player.getGuess() != targetNumber) {
            System.out.println("\n" + player.getGuess() +
                    (player.getGuess() > targetNumber ? " больше " : " меньше ") + "того, что загадал компьютер");
            System.out.println("оставшееся количество попыток = " + (3 - player.getAttemptsCount()));
            if (player.getAttemptsCount() == 3) {
                System.out.println("У " + player.getName() + " закончились попытки!");
            }
            return false;
        }
        System.out.println("\n" + player.getName() + " угадал число " + targetNumber +
                " c " + player.getAttemptsCount() + "-й попытки.");
        return true;
    }
}
