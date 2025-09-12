package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class BankTransactionReverser {
    public static void main(String[] args) {
        int[] transactions = new int[] {};
        displayTransactions(reverseTransactions(transactions));
        transactions = null;
        displayTransactions(reverseTransactions(transactions));
        transactions = new int[] {5};
        displayTransactions(reverseTransactions(transactions));
        transactions = new int[] {6, 8, 9, 1};
        displayTransactions(reverseTransactions(transactions));
        transactions = new int[] {13, 8, 5, 3, 2, 1, 1};
        displayTransactions(reverseTransactions(transactions));
    }

    private static int[] reverseTransactions(int[] transactions) {
        if (transactions == null) {
            return null;
        }
        if (transactions.length == 0) {
            return new int[0];
        }
        int[] reversed = new int[transactions.length];
        int index = transactions.length;

        for (int value : transactions) {
            reversed[--index] = value;
        }
        return reversed;
    }

    private static void displayTransactions(int[] reversed) {
        if (reversed == null) {
            System.out.println("null (ошибка в данных)\n");
            return;
        }
        if (reversed.length == 0) {
            System.out.println("пустой массив (нет данных)\n");
            return;
        }
        System.out.print("Исходные транзакции: " + Arrays.toString(reverseTransactions(reversed)));
        System.out.print("\nВ обратном  порядке: " + Arrays.toString(reversed));
        System.out.println();
    }
}