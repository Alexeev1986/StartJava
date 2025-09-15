package com.startjava.lesson_2_3_4.array.util;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        arrayFilterExceeding();
        bankTransactionReverser();
        factorialCalculator();
        passwordCracker();
        symbolTrianglePrinter();
        typewriterEffect();
        uniqueArrayFiller();
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

    public static void bankTransactionReverser() {
        int[] transactions = new int[] {};
        Console.displayTransactions(Arrays.reverseTransactions(transactions));
        transactions = null;
        Console.displayTransactions(Arrays.reverseTransactions(transactions));
        transactions = new int[] {5};
        Console.displayTransactions(Arrays.reverseTransactions(transactions));
        transactions = new int[] {6, 8, 9, 1};
        Console.displayTransactions(Arrays.reverseTransactions(transactions));
        transactions = new int[] {13, 8, 5, 3, 2, 1, 1};
        Console.displayTransactions(Arrays.reverseTransactions(transactions));
    }

    public static void factorialCalculator() {
        int[] numbers = new int[0];
        long[] factorials = Arrays.calculateFactorials(numbers);
        Console.printCalculatedFactorials(numbers, factorials);
        numbers = null;
        factorials = Arrays.calculateFactorials(numbers);
        Console.printCalculatedFactorials(numbers, factorials);
        numbers = new int[] {8, 0, 9};
        factorials = Arrays.calculateFactorials(numbers);
        Console.printCalculatedFactorials(numbers, factorials);
        numbers = new int[]{-3, 1, 7, 13};
        factorials = Arrays.calculateFactorials(numbers);
        Console.printCalculatedFactorials(numbers, factorials);
        numbers = new int[]{-22, -0};
        factorials = Arrays.calculateFactorials(numbers);
        Console.printCalculatedFactorials(numbers, factorials);
    }

    public static void passwordCracker() throws InterruptedException {
        Console.displayHackResult(Arrays.hackPassword(3));
    }

    public static void symbolTrianglePrinter() {
        Console.displayTriangle(Arrays.createTriangle('0', '9', true));
        Console.displayTriangle(Arrays.createTriangle('/', '!', false));
        Console.displayTriangle(Arrays.createTriangle('A', 'J', false));
    }

    public static void typewriterEffect() throws InterruptedException {
        Console.displayTypewriter(Arrays.toUpperCaseBetweenShortestAndLongestWord("Java - это C++, из " +
                "которого убрали все пистолеты, ножи и дубинки.\n" +
                "- James Gosling"));
        Console.displayTypewriter(Arrays.toUpperCaseBetweenShortestAndLongestWord("Чтобы написать " +
                "чистый код, мы сначала пишем грязный код, затем рефакторим его.\n" +
                "- Robert Martin"));
        Console.displayTypewriter(Arrays.toUpperCaseBetweenShortestAndLongestWord(null));
        Console.displayTypewriter(Arrays.toUpperCaseBetweenShortestAndLongestWord(""));
    }

    public static void uniqueArrayFiller() {
        Console.printSortedUniqueNumbers(Arrays.generateUniqueNumbers(-30, -10, 23));
        Console.printSortedUniqueNumbers(Arrays.generateUniqueNumbers(10, 50, 10));
        Console.printSortedUniqueNumbers(Arrays.generateUniqueNumbers(-34, -34, 1));
        Console.printSortedUniqueNumbers(Arrays.generateUniqueNumbers(-1, 2, -3));
        Console.printSortedUniqueNumbers(Arrays.generateUniqueNumbers(5, -8, 2));
    }
}