package com.startjava.lesson_2_3_4.array;

public class SymbolTrianglePrinter {
    public static void main(String[] args) {
        displayTriangle(createTriangle('0', '9', true));
        displayTriangle(createTriangle('/', '!', false));
        displayTriangle(createTriangle('A', 'J', false));
    }

    private static String createTriangle(char left, char right, boolean ascending) {
        if (left > right) {
            System.out.println("Ошибка: левая граница больше правой.");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (ascending) {
            int indent = right - left;
            sb.setLength(0);
            int count = 1;
            for (char i = right; i >= left; i--) {
                sb.append(" ".repeat(indent)).append(String.valueOf(i).repeat(count)).append("\n");
                indent -= 1;
                count += 2;
            }
            return sb.toString();
        } else {
            int indent = right - left;
            sb.setLength(0);
            int count = 1;
            for (char i = left; i <= right; i++) {
                sb.append(" ".repeat(indent)).append(String.valueOf(i).repeat(count)).append("\n");
                indent -= 1;
                count += 2;
            }
            return sb.toString();
        }
    }

    public static void displayTriangle(String triangle) {
        System.out.println(triangle);
    }
}
