package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class BankTransactionReverser {
    public static void main(String[] args) {
        int[] transactions = new int[0];
        displayTransactions(transactions, reverseTransactions(transactions));
        transactions = null;
        displayTransactions(transactions, reverseTransactions(transactions));
        transactions = new int[] {5};
        displayTransactions(transactions, reverseTransactions(transactions));
        transactions = new int[] {6, 8, 9, 1};
        displayTransactions(transactions, reverseTransactions(transactions));
        transactions = new int[] {13, 8, 5, 3, 2, 1, 1};
        displayTransactions(transactions, reverseTransactions(transactions));
    }

    private static int[] reverseTransactions(int[] transactions) {
        if (transactions == null) {
            return null;
        }
        if (transactions.length == 0) {
            return new int[0];
        }
        int[] reversed = new int[transactions.length];
        int index = transactions.length - 1;

        for (int value : transactions) {
            reversed[index] = value;
            index--;
        }
        return reversed;
    }

    private static void displayTransactions(int[] original, int[] reverse) {
        if (original == null) {
            System.out.println("null (ошибка в данных)\n");
            return;
        }
        if (original.length == 0) {
            System.out.println("пустой массив (нет данных)\n");
            return;
        }
        System.out.print("Исходные транзакции: ");
        System.out.print(Arrays.toString(original));
        System.out.print("\nВ обратном  порядке: ");
        System.out.print(Arrays.toString(reverse));
        System.out.println();
    }
}