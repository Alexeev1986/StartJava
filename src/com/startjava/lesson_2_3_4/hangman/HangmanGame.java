package com.startjava.lesson_2_3_4.hangman;

import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    private String[] hiddenWords = new String[] {"яблоко", "лисица", "мороз",
                                                 "велосипед", "бабочка", "тетрадь",
                                                 "океан"};
    private String hiddenWord; // загаданное слово
    private String alreadyIntroduced;
    private String[] hangman = new String[] {
            "_______",
            "|     |",
            "|     @",
            "|    /|\\",
            "|    / \\",
            "| GAME OVER!"
    };
    private String[] hiddenLetters; // массив с отгадываемыми буквами
    private String[] unsolvedSymbols; // массив отображаемых символов при загадывании
    private int attemptsCount; // количество попыток

    public void start() {
        Random random = new Random();
        hiddenWord = hiddenWords[random.nextInt(0, 7)];
        attemptsCount = 5;
        alreadyIntroduced = "";
        unsolvedSymbols = new String[hiddenWord.length()];
        hiddenLetters = new String[hiddenWord.length()];
        for (int i = 0; i < hiddenWord.length(); i++) {
            hiddenLetters[i] = String.valueOf(hiddenWord.charAt(i));
            unsolvedSymbols[i] = "_";
        }
        System.out.println("Вас приветствует игра виселица!");
        printUnsolvedSymbols();
        boolean isWin = false;
        while (attemptsCount > 0 && !isWin) {
            hasLetter(enterLetter());
            displayHangman(attemptsCount);
            printUnsolvedSymbols();
            isWin = isWinGame();
        }
        System.out.println(isWin ? "Поздравляю вы выйграли!" : "Вы проиграли. Загаданное слово: " +
                hiddenWord);
    }

    private void printUnsolvedSymbols() {
        for (String temp : unsolvedSymbols) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    private boolean isWinGame() {
        for (int i = 0; i < unsolvedSymbols.length; i++) {
            if (unsolvedSymbols[i].equals("_")) {
                return false;
            }
        }
        return true;
    }

    private void hasLetter(String letter) {
        boolean isFound = false;
        for (int i = 0; i < hiddenLetters.length; i++) {
            if (hiddenLetters[i].equalsIgnoreCase(letter)) {
                unsolvedSymbols[i] = String.valueOf(Character.toUpperCase(hiddenLetters[i].charAt(0)));
                isFound = true;
            }
        }
        if (!isFound) {
            attemptsCount--;
        } else {
            if (attemptsCount != 5) {
                attemptsCount++;
            }
        }
    }

    private void displayHangman(int attemptsCount) {
        int partsHangman = 6 - attemptsCount;
        for (int i = 0; i < partsHangman; i++) {
            System.out.println(hangman[i]);
        }
    }

    private String enterLetter() {
        Scanner console = new Scanner(System.in);
        boolean isletter = false;
        String str = "";
        while (!isletter) {
            System.out.println("Введите одну букву: ");
            str = console.nextLine();
            if (isSingleLetter(str)) {
                if (isAlreadyIntroduced(str)) {
                    System.out.println("Отлично вы ввели букву " + str);
                    isletter = true;
                } else {
                    System.out.println("Вы уже вводил такую букву! Раннее введенные буквы (" +
                            alreadyIntroduced + ")");
                    isletter = false;
                }
            } else {
                System.out.println("Это не одна буква попробуйте снова.");
            }
        }
        return str;
    }

    private boolean isAlreadyIntroduced(String letter) {
        if (alreadyIntroduced.length() == 0) {
            alreadyIntroduced = letter;
            return true;
        } else {
            for (int i = 0; i < alreadyIntroduced.length(); i++) {
                if (alreadyIntroduced.charAt(i) == letter.charAt(0)) {
                    System.out.println("Вы уже вводили такую букву попробуйте еще раз.");
                    return false;
                }
            }
            alreadyIntroduced += " " + letter;
            return true;
        }
    }

    private boolean isSingleLetter(String str) {
        if (str == null || str.length() != 1) {
            return false;
        }
        char letter = str.charAt(0);
        return Character.isLetter(letter);
    }
}
