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

    private static void bankTransactionReverser() {
        int[][] transactionsSets = {
                {},
                null,
                {5},
                {6, 8, 9, 1},
                {13, 8, 5, 3, 2, 1, 1}
        };
        for (int[] transactions : transactionsSets) {
            Console.printMessageArray(transactions, "Исходные транзакции: ");
            Console.printMessageArray(Arrays.reverseTransactions(transactions), "В обратном  порядке: ");
        }
    }

    private static void passwordCracker() throws InterruptedException {
        Console.printSpin(3);
        Console.displayHackResult(Arrays.hackPassword());
    }

    private static void factorialCalculator() {
        int[][] numbersSets = {
                {},
                null,
                {8, 0, 9},
                {-3, 1, 7, 13},
                {-22, -0}
        };
        for (int[] numbers : numbersSets) {
            long[] factorials = Arrays.calculateFactorials(numbers);
            Console.printFactorialsExpressions(numbers, factorials);
        }
    }

    private static void arrayFilterExceeding() {
        int[] numbers = {-1, 15, 0, 14};
        float[] original = Arrays.generateArray();
        for (int index : numbers) {
            float[] filteredArr = Arrays.filterAboveThreshold(index, original);
            Console.printArraysWithIndexValue(original, filteredArr, index);
        }
        System.out.println();
    }

    private static void symbolTrianglePrinter() {
        Object[][] meaningsSets = {
                {'0', '9', true},
                {'/', '!', false},
                {'A', 'J', false}
        };

        for (Object[] meanings : meaningsSets) {
            char start = (char) meanings[0];
            char end = (char) meanings[1];
            boolean ascending = (boolean) meanings[2];

            String triangle = Arrays.createTriangle(start, end, ascending);
            Console.println(triangle);
            System.out.println();
        }
    }

    private static void uniqueArrayFiller() {
        int[][] numbersSets = {
                {-30, -10, 23},
                {10, 50, 10},
                {-34, -34, 1},
                {-1, 2, -3},
                {5, -8, 2}
        };
        for (int[] numbers : numbersSets) {
            int min = numbers[0];
            int max = numbers[1];
            int count = numbers[2];

            int[] generated = Arrays.generateAndSortUniqueNumbers(min, max);
            Console.printArrayBlock(generated, min, max, count);
        }
    }

    private static void typewriterEffect() throws InterruptedException {
        String[] texts = {"Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n- James Gosling",
                "Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его.\n- Robert Martin",
                null,
                ""
        };
        for (String text : texts) {
            Console.typewriterPrinter(Arrays.toUpperCaseBetweenShortestAndLongestWord(text));
        }
    }
}