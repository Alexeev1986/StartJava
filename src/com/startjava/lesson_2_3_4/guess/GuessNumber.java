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
        System.out.println(targetNumber);
        System.out.println("Игра началась! У каждого игрока по " + player1.MAX_ATTEMPTS + " попыток");
        boolean gameOver = false;
        while (!gameOver) {
            if (madeAttempt(player1, targetNumber)) {
                break;
            }
            if (madeAttempt(player2, targetNumber)) {
                break;
            }
            if (player1.getAttemptsCount() == player1.MAX_ATTEMPTS) {
                gameOver = true;
            }
        }
        if (gameOver == true) {
            System.out.println("Игра окончена победителей нет!");
            printNumbers(player1);
            printNumbers(player2);
        }
    }

    private boolean madeAttempt(Player player, int targetNumber) {
        Scanner console = new Scanner(System.in);
        System.out.println("Попытка № " + (player.getAttemptsCount() + 1));
        System.out.println("Число вводит " + player.getName() + ":");
        while (!player.addNumber(console.nextInt())) {
            System.out.println("Число должно входить в отрезок [1, 100].\n" +
                    "Попробуйте еще раз:");
        }
        if (player.getNumber() == targetNumber) {
            System.out.println("\n" + player.getName() + " угадал число " + targetNumber +
                    " c " + player.getAttemptsCount() + "-й попытки.");
            return true;
        } else {
            System.out.println("\n" + player.getNumber() +
                    (player.getNumber() > targetNumber ? " больше " : " меньше ") +
                    "того, что загадал компьютер");
            if (player.getAttemptsCount() == player.MAX_ATTEMPTS) {
                System.out.println("У " + player.getName() + " закончились попытки!");
            }
            return false;
        }
    }

    private void printNumbers(Player player) {
        System.out.println("Названные " + player.getName() +
                " числа:" + Arrays.toString(player.getNumbers()));
        player1.clear();
    }
}
