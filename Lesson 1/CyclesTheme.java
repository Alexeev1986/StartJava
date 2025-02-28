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
        startInterval = -1;
        endInterval = 10;
        int midInterval = 5;
        int maxNumber = 0;
        int minNumber = 0;
        for (int i = startInterval; i <= endInterval; i++) {
            System.out.print(i + " ");
            if (i == startInterval || i == midInterval || i == endInterval) {
                if (maxNumber < i) maxNumber = i;
                if (minNumber > i) minNumber = i;
            }
        }
        System.out.println();
        System.out.println("Максимальное число в данном интервале = " + maxNumber);
        System.out.println("Минимальное число в данном интервале = " + minNumber);

        // Задание №3
        System.out.println("Задание №3. Вывод реверсивного числа и суммы его цифр.");

        int initialNumber = 1234;
        int sumRemainder = 0;
        while (initialNumber > 0) {
            int remainder = initialNumber % 10;
            sumRemainder += remainder;
            System.out.println(" " + remainder);
            initialNumber /= 10;
        }
        System.out.println("Сумма чисел = " + sumRemainder);

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
            for (int i = numbersRow; i < 5; i++)System.out.printf("%4d", 0);
        }
        System.out.println();

        // Задание №5
        System.out.println("Задание №5. Проверка количества двоек числа на четность/нечетность.");

        initialNumber = 32425922;
        int initialNumberCopy = initialNumber;
        int sumTwos = 0;
        while (initialNumberCopy > 0) {
            if (initialNumberCopy % 10 == 2) sumTwos++;
            initialNumberCopy /= 10;
        }
        if (sumTwos % 2 == 0) {
            System.out.println("В числе " + initialNumber + " ЧЕТНОЕ количество двоек = " + sumTwos);
        } else {
            System.out.println("В числе " + initialNumber + " НЕ ЧЕТНОЕ Количество двоек = " + sumTwos);
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
        System.out.println();
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
        System.out.println("Задание №7.Вывод ASCII-символов.");

        System.out.printf("%10s%20s%20s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        System.out.println("----------------------------------------------------------");
        for (int i = 33; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%7d", i);
                System.out.printf("%19s", (char) i);
                System.out.printf("%-20s%n", "\t    " + Character.getName(i));
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%7d", i);
                System.out.printf("%19s", (char) i);
                System.out.printf("%-20s%n", "\t    " + Character.getName(i));
            }
        }

        // Задание №8
        System.out.println("Задание №8.Проверка, является ли число палиндромом.");

        int originalNumber = 1234321;
        int copyOriginalNumber = originalNumber;
        int reversNumber = 0;
        while (copyOriginalNumber > 0) {
            int remainder = copyOriginalNumber % 10;
            reversNumber = (reversNumber * 10) + remainder;
            copyOriginalNumber /= 10;
        }
        if (originalNumber == reversNumber) {
            System.out.println("Число " + originalNumber + " является палиндромом");
        } else {
            System.out.println("Число " + originalNumber + " не является палиндромом");
        }

        // Задание №9
        System.out.println("Задание №9.Проверка, является ли число счастливым.");
        originalNumber = 123321;
        int firstThreeDigits = originalNumber / 1000;
        int lastThreeDigits = originalNumber % 1000;
        int firstThreeDigitsSum = 0;
        int lastThreeDigitsSum = 0;
        for (int i = 0; i < 3; i++) {
            firstThreeDigitsSum += firstThreeDigits % 10;
            firstThreeDigits /= 10;
            lastThreeDigitsSum += lastThreeDigits % 10;
            lastThreeDigits /= 10;
        }
        if (firstThreeDigitsSum == lastThreeDigitsSum) {
            System.out.println("Число " + originalNumber + " это Счастливое число");
        } else {
            System.out.println("Число " + originalNumber + " не является Счастливым числом");
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
