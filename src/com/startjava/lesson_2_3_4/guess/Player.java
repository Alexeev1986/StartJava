package com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    private int guess;
    private int attempts = 0;
    private int allAttempts = 0;
    private int[] allGuessableNumbers = new int[6];


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int getAttemptsCount() {
        return attempts;
    }

    public boolean setGuess(int guess) {
        if (guess < 0 || guess > 100) {
            return false;
        }
        this.guess = guess;
        this.allGuessableNumbers[allAttempts++] = guess;
        this.attempts++;
        return true;
    }

    public int getGuess() {
        return guess;
    }
}
