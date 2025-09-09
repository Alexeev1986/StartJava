package com.startjava.lesson_2_3_4.array;

public class ReverseBankTransactions {
    public static void main(String[] args) {
        printResults(new int[0], reverseTransactions(new int[0]));
        printResults(null, reverseTransactions(null));
        printResults(new int[]{5}, reverseTransactions(new int[]{5}));
        printResults(new int[]{6, 8, 9, 1}, reverseTransactions(new int[]{6, 8, 9, 1}));
        printResults(new int[]{13, 8, 5, 3, 2, 1, 1}, reverseTransactions(new int[]{13, 8, 5, 3, 2, 1, 1}));
    }

    public static int[] reverseTransactions(int[] transactions) {
        if (transactions == null) {
            return null;
        }
        if (transactions.length == 0) {
            return new int[0];
        }
        int left = 0;
        int right = transactions.length - 1;
        while (left < right) {
            int temp = transactions[left];
            transactions[left] = transactions[right];
            transactions[right] = temp;
            left++;
            right--;
        }
        return transactions;
    }

    public static void printResults(int[] original, int[] reverse) {
        if (original == null) {
            System.out.println("Исходные транзакции: null");
            System.out.println("В обработанном порядке: ошибка\n");
            return;
        }
        if (original.length == 0) {
            System.out.println("Исходные транзакции: []");
            System.out.println("В обработанном порядке: []\n");
            return;
        }
        System.out.println("Исходные транзакции: ");
        printArray(original);
        System.out.println("В обработанном порядке:");
        printArray(reverse);
        System.out.println();
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(i < arr.length - 1 ? "," : "]");
        }
        System.out.println();
    }
}
