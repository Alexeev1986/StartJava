package com.startjava.lesson_2_3_4.array.util;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        arrayFilterExceeding();
        bankTransactionReverser();
        factorialCalculator();
        passwordCracker();
        symbolTrianglePrinter();
        textTypewriter();
        uniqueArrayFiller();
    }

    public static void arrayFilterExceeding() {
        float[] original = Arrays.genArray();
        int index = -1;
        float[] filteredArr = Arrays.filterByIndex(index, original);
        Console.displayIndexAndArrays(original, filteredArr, index);
        index = 15;
        filteredArr = Arrays.filterByIndex(index, original);
        Console.displayIndexAndArrays(original, filteredArr, index);
        index = 0;
        filteredArr = Arrays.filterByIndex(index, original);
        Console.displayIndexAndArrays(original, filteredArr, index);
        index = 14;
        filteredArr = Arrays.filterByIndex(index, original);
        Console.displayIndexAndArrays(original, filteredArr, index);
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

    public  static void  factorialCalculator() {
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
    }

    public static void passwordCracker() throws InterruptedException {
        Console.displayHackResult(Arrays.hackPassword(3));
    }

    public static void symbolTrianglePrinter() {
        Console.displayTriangle(Arrays.createTriangle('0', '9', true));
        Console.displayTriangle(Arrays.createTriangle('/', '!', false));
        Console.displayTriangle(Arrays.createTriangle('A', 'J', false));
    }

    public static void textTypewriter() throws InterruptedException {
        Console.displayTypewriter(Arrays.findShortestLongestWord("Java - это C++, из которого убрали" +
                " все пистолеты, ножи и дубинки.\n" +
                "- James Gosling"));
        Console.displayTypewriter(Arrays.findShortestLongestWord("Чтобы написать чистый код, мы" +
                " сначала пишем грязный код, затем рефакторим его.\n" +
                "- Robert Martin"));
        Console.displayTypewriter(Arrays.findShortestLongestWord(null));
        Console.displayTypewriter(Arrays.findShortestLongestWord(""));
    }

    public static void uniqueArrayFiller() {
        Console.displayUniqueArrayFiller(Arrays.arrayFilter(-30, -10, 23));
        Console.displayUniqueArrayFiller(Arrays.arrayFilter(10, 50, 10));
        Console.displayUniqueArrayFiller(Arrays.arrayFilter(-34, -34, 1));
        Console.displayUniqueArrayFiller(Arrays.arrayFilter(-1, 2, -3));
        Console.displayUniqueArrayFiller(Arrays.arrayFilter(5, -8, 2));
    }

}