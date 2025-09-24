package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private static final int START_RANGE = 1;
    private static final int END_RANGE = 100;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        int targetNumber = random.nextInt(START_RANGE, END_RANGE);
        System.out.println(targetNumber);
        System.out.println("Игра началась! У каждого игрока по " + player1.MAX_ATTEMPTS + " попыток");
        boolean gameOver = false;
        player1.clear();
        player2.clear();
        while (!gameOver) {
            if (makeAttempt(player1, targetNumber)) {
                break;
            }
            if (makeAttempt(player2, targetNumber)) {
                break;
            }
            if (player1.getAttemptsCount() == player1.MAX_ATTEMPTS) {
                gameOver = true;
            }
        }
        if (gameOver) {
            System.out.println("Игра окончена победителей нет!");
        }
        printNumbers();
    }

    private boolean makeAttempt(Player player, int targetNumber) {
        System.out.println("Попытка № " + (player.getAttemptsCount() + 1));
        System.out.println("Число вводит " + player.getName() + ":");
        Scanner console = new Scanner(System.in);
        while (!player.addNumber(console.nextInt())) {
            System.out.println("Число должно входить в отрезок [" + START_RANGE + "," + END_RANGE + "].\n" +
                    "Попробуйте еще раз:");
        }
        if (isGuessed(player, targetNumber)) {
            System.out.println("\n" + player.getName() + " угадал число " + targetNumber +
                    " c " + player.getAttemptsCount() + "-й попытки.");
            return true;
        }
        moreOrLess(player, targetNumber);
        return false;
    }

    private boolean isGuessed(Player player, int targetNumber) {
        return player.getNumber() == targetNumber;
    }

    private void moreOrLess(Player player, int targetNumber) {
        System.out.println("\n" + player.getNumber() +
                (player.getNumber() > targetNumber ? " больше " : " меньше ") +
                "того, что загадал компьютер");
        if (player.getAttemptsCount() == player.MAX_ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки!");
        }
    }

    private void printNumbers() {
        System.out.print("Ранне вводимые числа игроков: ");
        System.out.print(player1.getName() + " :" + Arrays.toString(player1.getNumbers()) + "; ");
        System.out.print(player2.getName() + " :" + Arrays.toString(player2.getNumbers()) + "\n");
    }
}
