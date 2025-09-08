package com.startjava.lesson_2_3_4.array;

public class ReverseBankTransactions {
    public static void main(String[] args) {
        reverseTransactions("");
        reverseTransactions("null");
        reverseTransactions("5");
        reverseTransactions("6, 8, 9, 1");
        reverseTransactions("13, 8, 5, 3, 2, 1, 1");
    }

    private static void reverseTransactions(String transactions) {
        if (transactions == null || transactions.isEmpty()) {
            System.out.println("Массив нулевой длины");
            return;
        } else {
            for (int i = 0; i < transactions.length(); i++) {
                char symbol = transactions.charAt(i);
                if (!Character.isDigit(symbol) && symbol != ',' && symbol != ' ') {
                    System.out.println("Null");
                    return;
                }
            }
        }
        String[] parts = transactions.split(",\\s*");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i].trim());
        }
        System.out.print("Исходные транзакции: [");
        int len = numbers.length - 1;
        int count = 0;
        for (int temp : numbers) {
            System.out.print(temp + (count != len ? "," : ""));
            count++;
        }
        System.out.print("]\n");
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        System.out.print("В обратном порядке: [");
        count = 0;
        for (int temp : numbers) {
            System.out.print(temp + (count != len ? "," : ""));
            count++;
        }
        System.out.print("]\n");
    }
}
