package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
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
        Random random = new Random();
        int targetNumber = random.nextInt(1, 100);
        System.out.println("Игра началась! У каждого игрока по " + player1.MAX_ATTEMPTS + " попыток");
        boolean gameOver = false;
        while (!gameOver) {
            if (palayerMadeAttept(player1, targetNumber)) {
                break;
            }
            if (palayerMadeAttept(player2, targetNumber)) {
                break;
            }
            if (player1.getAttemptsCount() == player1.MAX_ATTEMPTS) {
                gameOver = true;
            }
        }
        if (gameOver == true) {
            System.out.println("Игра окончена победителей нет!");
            System.out.println("Названные " + player1.getName() +
                    " числа:" + Arrays.toString(player1.getNumbers()));
            player1.clearNumbers();
            System.out.println("Названные " + player2.getName() +
                    " числа:" + Arrays.toString(player2.getNumbers()));
            player2.clearNumbers();
        }
    }

    public boolean palayerMadeAttept(Player player, int targetNumber) {
        Scanner console = new Scanner(System.in);
        System.out.println("Попытка № " + (player.getAttemptsCount() + 1));
        System.out.println("Число вводит " + player.getName() + ":");
        while (!player.setGuess(console.nextInt())) {
            System.out.println("Число должно входить в отрезок [1, 100].\n" +
                    "Попробуйте еще раз:");
            System.out.println("Попробуйте еще раз:");
        }
        return isGuessed(player, targetNumber);
    }

    public boolean isGuessed(Player player, int targetNumber) {
        if (player.getGuess() != targetNumber) {
            System.out.println("\n" + player.getGuess() +
                    (player.getGuess() > targetNumber ? " больше " : " меньше ") +
                    "того, что загадал компьютер");
            if (player.getAttemptsCount() == player.MAX_ATTEMPTS) {
                System.out.println("У " + player.getName() + " закончились попытки!");
            }
            return false;
        }
        System.out.println("\n" + player.getName() + " угадал число " + targetNumber +
                " c " + player.getAttemptsCount() + "-й попытки.");
        return true;
    }
}
