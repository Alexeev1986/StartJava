package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    public static final int MAX_ATTEMPTS = 10;
    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;
    private final String name;
    private final int[] numbers;
    private int attempts = 0;
    private int winCount;

    public Player(String name) {
        this.name = name;
        this.numbers = new int[MAX_ATTEMPTS];
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempts);
    }

    public int getAttemptsCount() {
        return attempts;
    }

    public int getLastNumber() {
        return numbers[attempts - 1];
    }

    public int getScore() {
        return winCount;
    }

    public void setWinCount(int score) {
        winCount = score;
    }

    public void addScore() {
        winCount++;
    }

    public boolean addNumber(int number) {
        if (number < START_RANGE || number > END_RANGE) {
            System.out.println("Число должно входить в отрезок [" +
                    Player.START_RANGE + "," + Player.END_RANGE + "].\n" + "Попробуйте еще раз:");
            return false;
        }
        numbers[attempts] = number;
        attempts++;
        return true;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }
}
