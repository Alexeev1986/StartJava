package com.startjava.lesson_2_3_4.array.util;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        bankTransactionReverser();
        passwordCracker();
        factorialCalculator();
        arrayFilterExceeding();
        symbolTrianglePrinter();
        uniqueArrayFiller();
        typewriterEffect();
    }

    public static void bankTransactionReverser() {
        int[] transactions = new int[] {};
        Console.printArrayAndReverse(Arrays.reverseTransactions(transactions));
        transactions = null;
        Console.printArrayAndReverse(Arrays.reverseTransactions(transactions));
        transactions = new int[] {5};
        Console.printArrayAndReverse(Arrays.reverseTransactions(transactions));
        transactions = new int[] {6, 8, 9, 1};
        Console.printArrayAndReverse(Arrays.reverseTransactions(transactions));
        transactions = new int[] {13, 8, 5, 3, 2, 1, 1};
        Console.printArrayAndReverse(Arrays.reverseTransactions(transactions));
    }

    public static void passwordCracker() throws InterruptedException {
        Console.displayHackResult(Arrays.hackPassword(3));
    }

    public static void factorialCalculator() {
        int[] numbers = new int[0];
        long[] factorials = Arrays.calculateFactorials(numbers);
        Console.printFactorials(numbers, factorials);
        numbers = null;
        factorials = Arrays.calculateFactorials(numbers);
        Console.printFactorials(numbers, factorials);
        numbers = new int[] {8, 0, 9};
        factorials = Arrays.calculateFactorials(numbers);
        Console.printFactorials(numbers, factorials);
        numbers = new int[]{-3, 1, 7, 13};
        factorials = Arrays.calculateFactorials(numbers);
        Console.printFactorials(numbers, factorials);
        numbers = new int[]{-22, -0};
        factorials = Arrays.calculateFactorials(numbers);
        Console.printFactorials(numbers, factorials);
    }

    public static void arrayFilterExceeding() {
        float[] original = Arrays.genArray();
        int index = -1;
        float[] filteredArr = Arrays.filterAboveThreshold(index, original);
        Console.printArraysWithIndexValue(original, filteredArr, index);
        index = 15;
        filteredArr = Arrays.filterAboveThreshold(index, original);
        Console.printArraysWithIndexValue(original, filteredArr, index);
        index = 0;
        filteredArr = Arrays.filterAboveThreshold(index, original);
        Console.printArraysWithIndexValue(original, filteredArr, index);
        index = 14;
        filteredArr = Arrays.filterAboveThreshold(index, original);
        Console.printArraysWithIndexValue(original, filteredArr, index);
    }

    public static void symbolTrianglePrinter() {
        Console.printStringBlock(Arrays.createTriangle('0', '9', true));
        Console.printStringBlock(Arrays.createTriangle('/', '!', false));
        Console.printStringBlock(Arrays.createTriangle('A', 'J', false));
    }

    public static void uniqueArrayFiller() {
        Console.printArrayBlock(Arrays.generateUniqueNumbers(-30, -10), -30, -10, 23);
        Console.printArrayBlock(Arrays.generateUniqueNumbers(10, 50), 10, 50, 10);
        Console.printArrayBlock(Arrays.generateUniqueNumbers(-34, -34), -34, -34, 1);
        Console.printArrayBlock(Arrays.generateUniqueNumbers(-1, 2), -1, 2, -3);
        Console.printArrayBlock(Arrays.generateUniqueNumbers(5, -8), 5, -8, 2);
    }

    public static void typewriterEffect() throws InterruptedException {
        Console.typewriterPrinter(Arrays.toUpperCaseBetweenShortestAndLongestWord("Java - это C++, из " +
                "которого убрали все пистолеты, ножи и дубинки.\n" +
                "- James Gosling"));
        Console.typewriterPrinter(Arrays.toUpperCaseBetweenShortestAndLongestWord("Чтобы написать " +
                "чистый код, мы сначала пишем грязный код, затем рефакторим его.\n" +
                "- Robert Martin"));
        Console.typewriterPrinter(Arrays.toUpperCaseBetweenShortestAndLongestWord(null));
        Console.typewriterPrinter(Arrays.toUpperCaseBetweenShortestAndLongestWord(""));
    }
}