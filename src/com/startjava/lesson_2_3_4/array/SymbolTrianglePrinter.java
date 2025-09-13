package com.startjava.lesson_2_3_4.array;

public class SymbolTrianglePrinter {
    public static void main(String[] args) {
        displayTriangle(createTriangle('0', '9', true));
        displayTriangle(createTriangle('/', '!', false));
        displayTriangle(createTriangle('A', 'J', false));
    }

    private static String createTriangle(char left, char right, boolean ascending) {
        if (left > right) {
            System.out.printf("Ошибка: левая граница (%d) > правой (%d).\n", (int) left, (int) right);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int indent = right - left;
        char start = ascending ? right : left;
        char end = ascending ? left : right;
        int step = ascending ? -1 : 1;
        for (char i = start; ascending ? i >= end : i <= end; i += step) {
            sb.append(" ".repeat(indent)).append(String.valueOf(i).repeat(count)).append("\n");
            indent -= 1;
            count += 2;
        }
        return sb.toString();
    }

    private static void displayTriangle(String triangle) {
        System.out.println(triangle);
    }
}
