package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class TextTypewriter {
    public static void main(String[] args) throws InterruptedException {
        displayTypewriter(findMinMaxWord("Java - это C++, из которого убрали" +
                " все пистолеты, ножи и дубинки.\n" +
                "- James Gosling"));
        displayTypewriter(findMinMaxWord("Чтобы написать чистый код, мы" +
                " сначала пишем грязный код, затем рефакторим его.\n" +
                "- Robert Martin"));
        displayTypewriter(findMinMaxWord(null));
        displayTypewriter(findMinMaxWord(""));
    }

    private static String findMinMaxWord(String text) {
        if (text == null) {
            return null;
        }
        if (text.length() == 0) {
            return "";
        }
        char[] simbols = new char[text.length()];
        int maxWord = 0;
        int minWord = 10;
        int maxPos = 0;
        int minPos = 0;
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            simbols[i] = text.charAt(i);
            if (Character.isLetter(simbols[i]) && i != text.length() - 1) {
                counter++;
            } else {
                if (maxWord < counter) {
                    maxWord = counter;
                    maxPos = i;
                }
                if (minWord > counter && counter != 0) {
                    minWord = counter;
                    minPos = i - counter - 1;
                }
                counter = 0;
            }
        }
        return (swapCaseInRange(simbols, minPos, maxPos));
    }

    private static String swapCaseInRange(char[] offer, int minPos, int maxPos) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < offer.length; i++) {
            if (i > minPos && i < maxPos) {
                sb.append(Character.toUpperCase(offer[i]));
            } else {
                sb.append(offer[i]);
            }
        }
        return (sb.toString());
    }

    private static void displayTypewriter(String text) throws InterruptedException {
        if (text == null) {
            System.out.println("\nОшибка: данные Null");
            return;
        }
        if (text.length() == 0) {
            System.out.println("\nОшибка: пустая строка");
            return;
        }
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            Thread.sleep(random.nextInt(50, 200));
        }
    }
}
