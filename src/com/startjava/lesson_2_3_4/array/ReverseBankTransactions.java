package com.startjava.lesson_2_3_4.array;

public class ReverseBankTransactions {
    public static void main(String[] args) {
        reverseBank(new int[0]);
        reverseBank(null);
        reverseBank(new int[]{5});
        reverseBank(new int[]{6, 8, 9, 1});
        reverseBank(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    private static void reverseBank(int[] transactions) {
        if(transactions == null) {
            System.out.println("Исходные транзакции: null");
            System.out.println(" В обратном порядке: ошибка в данных");
            return;
        }
        if (transactions.length == 0) {
            System.out.println("Исходные транзакции: []");
            System.out.println(" В обратном порядке: []");
            return;
        }
        System.out.print("Исходные транзакции: [");
        int len = transactions.length - 1;
        int count = 0;
        for (int temp : transactions) {
            System.out.print(temp + (count != len ? "," : ""));
            count++;
        }
        System.out.print("]\n");
        int left = 0;
        int right =  transactions.length - 1;

        while (left < right) {
            int temp = transactions[left];
            transactions[left] = transactions[right];
            transactions[right] = temp;
            left++;
            right--;
        }
        System.out.print("В обратном порядке: [");
        count = 0;
        for (int temp : transactions) {
            System.out.print(temp + (count != len ? "," : ""));
            count++;
        }
        System.out.print("]\n");
    }
}