package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        // Задание №1
        System.out.println("Задание №1. Подсчет суммы четных и нечетных чисел.");

        int startInterval = -10;
        int endInterval = 21;
        int counter = startInterval;
        int evenNumbersSum = 0;
        int oddNumbersSum = 0;
        do {
            if (counter % 2 == 0) {
                evenNumbersSum += counter;
            } else {
                oddNumbersSum += counter;
            }
            counter++;
        } while (counter <= endInterval);
        System.out.println("В отрезке [" + startInterval + ", " + endInterval + 
                "] сумма четных чисел = " + evenNumbersSum + ", а нечетных = " + 
                oddNumbersSum + "\n");

        // Задание №2
        System.out.println("Задание №2. Вывод чисел между min и max в порядке убывания.");
        int number1 = -1;
        int number2 = 5;
        int number3 = 10;
        int minNumber = number1;
        int maxNumber = number1;
        if (number2 < minNumber) minNumber = number2;
        if (number3 < minNumber) minNumber = number3;
        if (number2 > maxNumber) maxNumber = number2;
        if (number3 > maxNumber) maxNumber = number3;
        for (int i = maxNumber - 1; i > minNumber; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\nМаксимальное число в данном интервале = " + maxNumber);
        System.out.println("Минимальное число в данном интервале = " + minNumber + "\n");

        // Задание №3
        int initialNumber = 1234;
        System.out.println("Задание №3. Вывод реверсивного числа " + initialNumber + " и суммы его цифр.");
        int remainderSum = 0;
        while (initialNumber > 0) {
            int remainder = initialNumber % 10;
            remainderSum += remainder;
            System.out.print(remainder);
            initialNumber /= 10;
        }
        System.out.println(" Сумма чисел = " + remainderSum + "\n");

        // Задание №4
        System.out.println("Задание №4. Вывод чисел в несколько строк.");

        endInterval = 24;
        int rowCount = 0;
        
        for (int i = 1; i <= endInterval; i++) {    
            if (i % 2 != 0) {
                rowCount++;
                System.out.printf("%4d", i);
                if (rowCount > 4) {
                    System.out.println();
                    rowCount = 0;
                }
            }
        }
        // если счетчик чисел в строке не равен 0 до довыводим в строку нужное количество 0.
        if (rowCount != 0) {
            for (int i = rowCount; i < 5; i++) {
                System.out.printf("%4d", 0);
            }
        }

        // Задание №5
        System.out.println("\n\nЗадание №5. Проверка количества двоек числа на четность/нечетность.");

        initialNumber = 32425922;
        int initialNumberCopy = initialNumber;
        int twosCount = 0;
        while (initialNumberCopy > 0) {
            if (initialNumberCopy % 10 == 2) twosCount++;
            initialNumberCopy /= 10;
        }
        if (twosCount % 2 == 0) {
            System.out.println("В числе " + initialNumber + " ЧЕТНОЕ количество двоек = " + twosCount);
        } else {
            System.out.println("В числе " + initialNumber + " НЕ ЧЕТНОЕ Количество двоек = " + twosCount);
        }

        // Задание №6
        System.out.println("\nЗадание №6. Вывод геометрических фигур.");

        // 1-я фигура
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
        }
        System.out.print("\n\n");

        // 2-я фигура
        rowCount = 0;
        int charCount = 0;
        while (rowCount <= 5) {
            while (charCount < (5 - rowCount)) {
                System.out.print("#");
                charCount++;
            }
            charCount = 0;
            System.out.print("#\n");
            rowCount++;
        }
        System.out.println();

        // 3-я фигура
        rowCount = 0;
        charCount = 0;
        int increasingCount = 0;
        
        do {
            do {
                System.out.print("$");
                charCount++;
            } while ((charCount - 1) < increasingCount);
            if (rowCount < 2) {
                increasingCount++;
            } else if (rowCount >= 2) {
                increasingCount--;
            }
            System.out.println();
            rowCount++;
            charCount = 0;
        } while (rowCount < 5);

        // Задание №7
        System.out.println("\nЗадание №7.Вывод ASCII-символов.");

        System.out.printf("%10s%20s%20s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        System.out.println("----------------------------------------------------------");
        for (int i = 33; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%7d%19s", i, (char) i);
                System.out.printf("%-20s%n", "\t\t    " + Character.getName(i));
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%7d%19s", i, (char) i);
                System.out.printf("%-20s%n", "\t\t    " + Character.getName(i));
            }
        }

        // Задание №8
        System.out.println("\nЗадание №8.Проверка, является ли число палиндромом.");

        initialNumber = 1234321;
        initialNumberCopy = initialNumber;
        int reversedNumber = 0;
        while (initialNumberCopy > 0) {
            int remainder = initialNumberCopy % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            initialNumberCopy /= 10;
        }
        if (initialNumber == reversedNumber) {
            System.out.println("Число " + initialNumber + " является палиндромом");
        } else {
            System.out.println("Число " + initialNumber + " не является палиндромом");
        }

        // Задание №9
        System.out.println("\nЗадание №9.Проверка, является ли число счастливым.");
        initialNumber = 123321;
        int firstThreeDigits = initialNumber / 1000;
        int lastThreeDigits = initialNumber % 1000;
        int firstThreeDigitsSum = 0;
        int lastThreeDigitsSum = 0;
        for (int i = 0; i < 3; i++) {
            firstThreeDigitsSum += firstThreeDigits % 10;
            firstThreeDigits /= 10;
            lastThreeDigitsSum += lastThreeDigits % 10;
            lastThreeDigits /= 10;
        }
        if (firstThreeDigitsSum == lastThreeDigitsSum) {
            System.out.println("Число " + initialNumber + " это Счастливое число");
        } else {
            System.out.println("Число " + initialNumber + " не является Счастливым числом");
        }

        // Задание №10
        System.out.println("\nЗадание №10.Вывод таблицы умножения Пифагора.");

        System.out.println("\t    ТАБЛИЦА     ПИФАГОРА   ");
        
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 1 && i != 1) {
                    System.out.printf("%4d", i * j);
                    System.out.print("|");
                } else if (i == 1 && j == 1) {
                    System.out.printf("%4s", " ");
                    System.out.print("|");
                } else {
                    System.out.printf("%4d", i * j);
                }
                if (i == 1 && j == 9) {
                    System.out.print("\n  --+---------------------------------");
                }
            }
            System.out.println();
        }
    }
}
