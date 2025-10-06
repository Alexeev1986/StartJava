package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static final int PLAYER_COUNT = 3;
    private static final int ROUND_COUNT = 3;
    private final char[] spins = new char[] {'-', '\\', '|', '/'};
    private final Scanner console = new Scanner(System.in);
    private final Player[] players;
    private int targetNumber;

    public GuessNumber(Player[] players) {
        this.players = new Player[PLAYER_COUNT];
        System.arraycopy(players, 0, this.players, 0, PLAYER_COUNT);
    }

    public void start() throws InterruptedException {
        clearWinsPlayers();
        shufflePlayers();
        System.out.println("Игра началась! У каждого игрока по " + Player.MAX_ATTEMPTS + " попыток");
        Random random = new Random();
        for (int i = 1; i <= ROUND_COUNT; i++) {
            clearAllPlayers();
            targetNumber = random.nextInt(Player.START_RANGE, Player.END_RANGE + 1);
            System.out.println(targetNumber);
            System.out.println("Раунд № " + i + " игроки начинают угадывать числа.");
            while (true) {
                if (isGuessed()) {
                    break;
                }
                if (isAttemptsOver()) {
                    System.out.println("Раунд окончен победителей нет!");
                    break;
                }
            }
            printNumbers();
        }
        determineWinner();
    }

    private boolean isAttemptsOver() {
        return players[0].getAttemptsCount() == Player.MAX_ATTEMPTS;
    }

    private void clearWinsPlayers() {
        for (Player player : players) {
            player.setWinCount(0);
        }
    }

    private void shufflePlayers() throws InterruptedException {
        printSpin();
        Random random = new Random();
        for (int i = players.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Player temp = players[i];
            players[i] = players[j];
            players[j] = temp;
        }
        System.out.println("Порядок ходов определен :");
        for (int i = 0; i < PLAYER_COUNT; i++) {
            System.out.println(i + 1 + "." + players[i].getName());
        }
    }

    private void printSpin() throws InterruptedException {
        for (int i = 0; i < spins.length * 3; i++) {
            System.out.print("Бросаем жребий: " + spins[i % 4] + "\r");
            Thread.sleep(300);
        }
    }

    private void clearAllPlayers() {
        for (Player player : players) {
            player.clear();
        }
    }

    private boolean isGuessed() {
        for (Player player : players) {
            if (makeAttempt(player)) {
                player.addScore();
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
        System.out.println("\n" + player.getLastNumber() +
                (player.getLastNumber() > targetNumber ? " больше " : " меньше ") +
                "того, что загадал компьютер");
        if (player.getAttemptsCount() == Player.MAX_ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки!");
        }
        return false;
    }

    private void inputNumber(Player player) {
        while (true) {
            if (console.hasNextInt()) {
                int number = console.nextInt();
                if (player.addNumber(number)) {
                    return;
                }
            } else {
                System.out.println("Ошибка: введите целое число.");
                console.next();
            }
        }
    }

    private boolean checkGuess(Player player) {
        return player.getLastNumber() == targetNumber;
    }

    private void printNumbers() {
        System.out.println("Ранее вводимые числа игроков: ");
        for (Player player : players) {
            System.out.println(player.getName() + " :" + Arrays.toString(player.getNumbers()) + "; ");
        }
    }

    private void determineWinner() {
        System.out.println("Количество побед:");
        for (Player player : players) {
            System.out.println(player.getName() + " - " + player.getScore());
        }
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

    private boolean isDraw() {
        for (int i = 1; i < players.length; i++) {
            if (players[0].getScore() != players[i].getScore()) {
                return false;
            }
        }
        return true;
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
}
