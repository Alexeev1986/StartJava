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
        return numbers[attempts - 1];
    }

    public boolean addNumber(int number) {
        if (number < 0 || number > 100) {
            return false;
        }
        this.numbers[attempts] = number;
        this.attempts++;
        return true;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }
}
