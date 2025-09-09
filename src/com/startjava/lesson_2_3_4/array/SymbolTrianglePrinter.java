package com.startjava.lesson_2_3_4.array;

public class SymbolTrianglePrinter {
    public static void main(String[] args) {
        System.out.println(printTriangle('0', '9', true));
        System.out.println(printTriangle('/', '!', false));
        System.out.println(printTriangle('A', 'J', false));
    }

    public static String printTriangle(char left, char right, boolean isUpDirection) {
        if (left > right) {
            return "Ошибка: левая граница больше правой.";
        }
        if (isUpDirection) {
            int indent = right - left;
            StringBuilder sb = new StringBuilder();
            int numberOfChar = 1;
            for (char i = right; i >= left; i--) {
                sb.append(" ".repeat(indent));
                sb.append(String.valueOf(i).repeat(numberOfChar));
                sb.append("\n");
                indent -= 1;
                numberOfChar += 2;
            }
            return sb.toString();
        } else {
            int indent = right - left;
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (char i = left; i <= right; i++) {
                sb.append(" ".repeat(indent));
                sb.append(String.valueOf(i).repeat(count));
                sb.append("\n");
                indent -= 1;
                count += 2;
            }
            return sb.toString();
        }
    }
}
