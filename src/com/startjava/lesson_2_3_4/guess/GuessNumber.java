package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static final int PLAYER_COUNT = 3;
    public static final int ROUND_COUNT = 3;
    private final Player[] players;
    private int targetNumber;

    public GuessNumber(Player[] players) {
        this.players = new Player[PLAYER_COUNT];
        System.arraycopy(players, 0, this.players, 0, PLAYER_COUNT);
    }

    public void start() throws InterruptedException {
        clearWinsPlayers();
        fisher_Shuffle();
        System.out.println("Игра началась! У каждого игрока по " + Player.MAX_ATTEMPTS + " попыток");
        Random random = new Random();
        for (int i = 1; i < ROUND_COUNT + 1; i++) {
            clearAllPlayers();
            targetNumber = random.nextInt(Player.START_RANGE, Player.END_RANGE + 1);
            System.out.println(targetNumber);
            boolean gameOver = false;
            System.out.println("Раунд № " + i + " игроки начинают угадывать числа.");
            while (!gameOver) {
                if (makeAttemptAll()) {
                    break;
                }
                if (players[0].getAttemptsCount() == Player.MAX_ATTEMPTS) {
                    gameOver = true;
                }
            }
            if (gameOver) {
                System.out.println("Раунд окончен победителей нет!");
            }
            printNumbers();
        }
        printScoreboard();
        determineWinner();
    }

    private boolean makeAttemptAll() {
        for (int i = 0; i < players.length; i++) {
            if (makeAttempt(players[i])) {
                players[i].addScore();
                return true;
            }
        }
        return false;
    }

    private boolean makeAttempt(Player player) {
        System.out.println("Попытка № " + (player.getAttemptsCount() + 1));
        System.out.println("Число вводит " + player.getName() + ":");
        inputNumber(player);
        if (checkGuess(player)) {
            System.out.println("\n" + player.getName() + " угадал число " + targetNumber +
                    " c " + player.getAttemptsCount() + "-й попытки.");
            return true;
        }
        return false;
    }

    private void inputNumber(Player player) {
        Scanner console = new Scanner(System.in);
        while (!player.addNumber(console.nextInt())) {
            System.out.println("Число должно входить в отрезок [" +
                    Player.START_RANGE + "," + Player.END_RANGE + "].\n" + "Попробуйте еще раз:");
        }
    }

    private boolean checkGuess(Player player) {
        if (player.getLastNumber() == targetNumber) {
            return true;
        }
        System.out.println("\n" + player.getLastNumber() +
                (player.getLastNumber() > targetNumber ? " больше " : " меньше ") +
                "того, что загадал компьютер");
        if (player.getAttemptsCount() == Player.MAX_ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки!");
        }
        return false;
    }

    private void printScoreboard() {
        System.out.println("Количество побед:");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i].getName() + " - " + players[i].getScore());
        }
    }

    private void printNumbers() {
        System.out.print("Ранее вводимые числа игроков: ");
        for (int i = 0; i < players.length; i++) {
            System.out.print(players[i].getName() + " :" + Arrays.toString(players[i].getNumbers()) + "; ");
        }
        System.out.println();
    }

    private void clearAllPlayers() {
        for (int i = 0; i < players.length; i++) {
            players[i].clear();
        }
    }

    private void clearWinsPlayers() {
        for (int i = 0; i < players.length; i++) {
            players[i].setWinCount(0);
        }
    }

    private void determineWinner() {
        if (isDraw()) {
            if (players[0].getScore() == 0) {
                System.out.println("Общий проигрыш.");
            } else {
                System.out.println("Ничья! победила дружба!");
            }
        } else {
            System.out.println("Победил " + findWinner() + " !");
        }
    }

    private String findWinner() {
        int maxWins = 0;
        int indexWinPlayer = 0;
        for (int i = 0; i < players.length; i++) {
            if (maxWins < players[i].getScore()) {
                maxWins = players[i].getScore();
                indexWinPlayer = i;
            }
        }
        return players[indexWinPlayer].getName();
    }

    private boolean isDraw() {
        for (int i = 1; i < players.length; i++) {
            if (players[0].getScore() != players[i].getScore()) {
                return false;
            }
        }
        return true;
    }

    private void fisher_Shuffle() throws InterruptedException {
        printSpin(4);
        System.out.println("Порядок ходов определен :");
        for (int i = 0; i < PLAYER_COUNT; i++) {
            System.out.println(i + 1 + "." + players[i].getName());
        }
        Random random = new Random();
        for (int i = players.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Player temp = players[i];
            players[i] = players[j];
            players[j] = temp;
        }
    }

    public void printSpin(int rotationsCount) throws InterruptedException {
        char[] spins = new char[] {'-', '\\', '|', '/'};
        for (int i = 0; i < spins.length * rotationsCount; i++) {
            System.out.print("Бросаем жребий: " + spins[i % 4] + "\r");
            Thread.sleep(300);
        }
    }
}
