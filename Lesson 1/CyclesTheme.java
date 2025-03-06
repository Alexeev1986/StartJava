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
                "] сумма четных чисел = " + evenNumbersSum + ", а нечетных = " + oddNumbersSum);

        // Задание №2
        System.out.println("Задание №2. Вывод чисел между min и max в порядке убывания.");
        int number1 = -1;
        int number2 = 5;
        int number3 = 10;
        if (number1 < number2) {
            startInterval = number1;
        } else startInterval = number2;
        if (startInterval < number3) {
            startInterval = number1;
        } else startInterval = number3;
        if (number1 > number2) {
            endInterval = number1;
        } else endInterval = number2;
        if (endInterval > number3) {
            endInterval = number1;
        } else endInterval = number3;
        for (int i = startInterval; i <= endInterval; i++) {
            System.out.print(i + " ");
        }
        System.out.printf("%nМаксимальное число в данном интервале = " + endInterval + "%n");
        System.out.println("Минимальное число в данном интервале = " + startInterval);

        // Задание №3
        int initialNumber = 1234;
        System.out.println("Задание №3. Вывод реверсивного числа " + initialNumber + " и суммы его цифр.");
        int sumRemainder = 0;
        while (initialNumber > 0) {
            int remainder = initialNumber % 10;
            sumRemainder += remainder;
            System.out.printf("%d", remainder);
            initialNumber /= 10;
        }
        System.out.printf("%nСумма чисел = " + sumRemainder + "%n");

        // Задание №4
        System.out.println("Задание №4. Вывод чисел в несколько строк.");

        endInterval = 24;
        int numbersRow = 0;
        
        for (int i = 1; i <= endInterval; i++) {    
            if (i % 2 != 0) {
                numbersRow++;
                System.out.printf("%4d", i);
                if (numbersRow > 4) {
                    System.out.printf("%n");
                    numbersRow = 0;
                }
            }
        }
        // если счетчик чисел в строке не равен 0 до довыводим в строку нужное количество 0.
        if (numbersRow != 0) {
            for (int i = numbersRow; i < 5; i++) {
                System.out.printf("%4d", 0);
            }
        }

        // Задание №5
        System.out.printf("%nЗадание №5. Проверка количества двоек числа на четность/нечетность.%n");

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
        System.out.println("Задание №6. Вывод геометрических фигур.");

        // 1-я фигура
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%n");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("*");
            }
        }
        System.out.printf("%n%n");
        // 2-я фигура
        int rowCount = 0;
        int charCount = 0;
        while (rowCount <= 5) {
            while (charCount < (5 - rowCount)) {
                System.out.printf("#");
                charCount++;
            }
            charCount = 0;
            System.out.printf("#%n");
            rowCount++;
        }
        System.out.printf("%n");
        // 3-я фигура
        rowCount = 0;
        charCount = 0;
        int increasingCount = 0;
        
        do {
            do {
                System.out.printf("$");
                charCount++;
            } while ((charCount - 1) < increasingCount);
            if (rowCount < 2) {
                increasingCount++;
            }
            if (rowCount >= 2) {
                increasingCount--;
            }
            System.out.printf("%n");
            rowCount++;
            charCount = 0;
        } while (rowCount < 5);

        // Задание №7
        System.out.printf("%nЗадание №7.Вывод ASCII-символов.%n");

        System.out.printf("%10s%20s%20s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        System.out.println("----------------------------------------------------------");
        for (int i = 33; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%7d", i);
                System.out.printf("%19s", (char) i);
                System.out.printf("%-20s%n", "\t\t    " + Character.getName(i));
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%7d", i);
                System.out.printf("%19s", (char) i);
                System.out.printf("%-20s%n", "\t\t    " + Character.getName(i));
            }
        }

        // Задание №8
        System.out.println("Задание №8.Проверка, является ли число палиндромом.");

        initialNumber = 1234321;
        int copyInitialNumber = initialNumber;
        int reversedNumber = 0;
        while (copyInitialNumber > 0) {
            int remainder = copyInitialNumber % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            copyInitialNumber /= 10;
        }
        if (initialNumber == reversedNumber) {
            System.out.println("Число " + initialNumber + " является палиндромом");
        } else {
            System.out.println("Число " + initialNumber + " не является палиндромом");
        }

        // Задание №9
        System.out.println("Задание №9.Проверка, является ли число счастливым.");
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
        System.out.println("Задание №10.Вывод таблицы умножения Пифагора.");

        System.out.println("\t    ТАБЛИЦА     ПИФАГОРА   ");
        
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 1 & i != 1) {
                    System.out.printf("%4d", i * j);
                    System.out.printf("|");
                } else if (i == 1 & j == 1) {
                    System.out.printf("%4s", " ");
                    System.out.printf("|");
                } else {
                    System.out.printf("%4d", i * j);
                }
                if (i == 1 & j == 9) {
                    System.out.printf("%n  --+---------------------------------");
                }
            }
            System.out.printf("%n");
        }
    }
}
