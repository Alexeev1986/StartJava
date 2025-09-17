package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int MAX_ATTEMPTS = 10;
    private int guess;
    private int attempts = 0;
    private int[] numbers;
    private String name;

    public void setName(String name) {
        this.name = name;
        this.numbers = new int[MAX_ATTEMPTS];
    }

    public String getName() {
        return name;
    }

    public int getAttemptsCount() {
        return attempts;
    }

    public boolean setGuess(int guess) {
        if (guess < 0 || guess > 100) {
            return false;
        }
        this.guess = guess;
        this.numbers[attempts] = guess;
        this.attempts++;
        return true;
    }

    public int getGuess() {
        return guess;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempts);
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }
}
