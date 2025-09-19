package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    public static final int MAX_ATTEMPTS = 10;
    private int attempts = 0;
    private int[] numbers;
    private String name;

    public Player(String name) {
        this.name = name;
        this.numbers = new int[MAX_ATTEMPTS];
    }

    public int getAttemptsCount() {
        return attempts;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempts);
    }

    public int getNumber() {
        int[] numbers = getNumbers();
        return numbers[numbers.length - 1];
    }

    public boolean addNumber(int guess) {
        if (guess < 0 || guess > 100) {
            return false;
        }
        this.numbers[attempts] = guess;
        this.attempts++;
        return true;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }
}
