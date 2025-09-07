package com.startjava.lesson_2_3_4.array;

import java.util.Scanner;

public class ReverseBankTransactions {
    private static int[] stringToIntArr(String transactionsStr) {
        String[] parts = transactionsStr.split(",\\s*");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i].trim());
        }
        return numbers;
    }

    private static int[] revers(int[] arr) {
        int left = 0;
        int right =  arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите транзакции через запятую:");
        String tempStr = console.nextLine();
        if(tempStr == null || tempStr.isEmpty()) {
            System.out.println("Массив нулевой длины");
            return;
        } else {
            for (int i = 0; i < tempStr.length(); i++) {
                char symbol = tempStr.charAt(i);
                if (!Character.isDigit(symbol) && symbol != ',' && symbol != ' ' && symbol != '-') {
                    System.out.println("Null");
                    return;
                }
            }
        }
        int[] transactionsInt = stringToIntArr(tempStr);
        System.out.print("Исходные транзакции: [");
        int len = transactionsInt.length - 1;
        int count = 0;
        for (int temp : transactionsInt) {
            System.out.print(temp + (count != len ? "," : ""));
            count++;
        }
        System.out.print("]\n");
        int[] reversTransactionsInt = revers(transactionsInt);
        System.out.print("В обратном порядке: [");
        count = 0;
        for (int temp : reversTransactionsInt) {
            System.out.print(temp + (count != len ? "," : ""));
            count++;
        }
        System.out.print("]\n");
    }
}
