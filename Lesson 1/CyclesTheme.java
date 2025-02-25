import java.math.BigInteger;

public class CyclesTheme {
    public static void main(String[] args) {
        // Задание №1
        System.out.printf("%nЗадание №1. Подсчет суммы четных и нечетных чисел.%n%n");

        int startInterval = -10;
        int endInterval = 21;
        int count = startInterval;
        int sumEvenNumber = 0;
        int sumOddNumber = 0;
        do {
            if (count % 2 == 0) {
                sumEvenNumber = sumEvenNumber + count;
            } else if (count % 2 != 0) {
                sumOddNumber = sumOddNumber + count;
            }
            count++;
        } while (count <= endInterval);
        System.out.println("В отрезке [" + startInterval + ", " + endInterval + "] сумма четных чисел = " +
                sumEvenNumber + ", а нечетных = " + sumOddNumber);

        // Задание №2
        System.out.printf("%nЗадание №2. Вывод чисел между min и max в порядке убывания.%n%n");
        startInterval = -1;
        endInterval = 10;
        int maxNumber = 0;
        int minNumber = 0;
        for (int i = startInterval; i <= endInterval; i++) {
            System.out.printf(i + " ");
            if (i == (-1) || i == 5 || i == 10) {
                if (maxNumber < i) maxNumber = i;
                if (minNumber > i) minNumber = i;
            }
        }
        System.out.printf("%n%nМаксимальное число в данном интервале = " + maxNumber);
        System.out.printf("%nМинимальное число в данном интервале = " + minNumber);

        // Задание №3
        System.out.printf("%n%nЗадание №3. Вывод реверсивного числа и суммы его цифр.%n%n");

        int initialNumber = 1234;
        int sumRemainder = 0;
        while (initialNumber > 0) {
            int remainder = initialNumber % 10;
            sumRemainder = sumRemainder + remainder;
            System.out.printf(" " + remainder);
            initialNumber /= 10;
        }
        System.out.printf("%n Сумма чисел = " + sumRemainder);

        // Задание №4
        System.out.printf("%n%nЗадание №4. Вывод чисел в несколько строк.%n%n");

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
            for (int j = numbersRow; j < 5; j++)System.out.printf("%4d", 0);
        }

        // Задание №5
        System.out.printf("%n%nЗадание №5. Проверка количества двоек числа на четность/нечетность.%n%n");

        initialNumber = 32425922;
        int copy = initialNumber;
        int sumTwos = 0;
        while (copy > 0) {
            if (copy % 10 == 2) sumTwos++;
            copy /= 10;
        }
        if (sumTwos % 2 == 0) {
            System.out.println("В числе " + initialNumber + " ЧЕТНОЕ количество двоек равное " + sumTwos);
        } else {
            System.out.println("В числе " + initialNumber + " НЕ ЧЕТНОЕ Количество двоек равное " + sumTwos);
        }

        // Задание №6
        System.out.printf("%n%nЗадание №6. Вывод геометрических фигур.%n%n");

        // 1-я фигура
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%n");
            for (int j = 1; j <= 10; j++) {
                System.out.printf(" * ");
            }
        }
        System.out.printf("%n%n");

        // 2-я фигура
        int counter1 = 0;
        int counter2 = 0;
        while (counter1 <= 5) {
            while (counter2 < (5 - counter1)) {
                System.out.printf(" # ");
                counter2++;
            }
            counter2 = 0;
            System.out.printf(" # %n");
            counter1++;
        }
        System.out.printf("%n");

        // 3-я фигура
        counter1 = 0;
        counter2 = 0;
        int counter3 = 0;
        int tr = 1;
        do {
            do {
                System.out.printf(" $ ");
                counter2++;
            } while ((counter2 - 1) < counter3);
            if (counter1 < 2) {
                counter3++;
            }
            if (counter1 >= 2) {
                counter3--;
            }
            System.out.printf("%n");
            counter1++;
            counter2 = 0;
        } while (counter1 < 5);

        // Задание №7
        System.out.printf("%n%nЗадание №7.Вывод ASCII-символов.%n%n");

        System.out.printf("%10s%20s%20s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        y("----------------------------------------------------------");
        for (int i = 33; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%7d", i);
                System.out.printf("%19s", (char) i);
                System.out.printf("%-20s%n", "\t" + "\t" + Character.getName(i));
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0 & Character.isLetter((char) i) == true) {
                System.out.printf("%7d", i);
                System.out.printf("%19s", (char) i);
                System.out.printf("%-20s%n", "\t" + "\t" + Character.getName(i));
            }
        }

        // Задание №8
        System.out.printf("%n%nЗадание №8.Проверка, является ли число палиндромом.%n%n");

        initialNumber = 1234321;
        int sizeNumber = String.valueOf(initialNumber).length();
        String strNumber = String.valueOf(initialNumber);
        boolean isPolindrom = true;
        for (int i = 0; i < sizeNumber / 2; i++) {
            if (strNumber.charAt(i) != strNumber.charAt(sizeNumber - i - 1)) {
                isPolindrom = false;
            }
        }
        if (isPolindrom) {
            System.out.printf("Это число " + initialNumber + " является палиндромом%n%n");
        } else {
            System.out.printf("Это число " + initialNumber + " не является палиндромом%n%n");
        }

        // Задание №9
        System.out.printf("%n%nЗадание №9.Проверка, является ли число счастливым.%n%n");
        initialNumber = 123321;
        strNumber = String.valueOf(initialNumber);
        sizeNumber = String.valueOf(initialNumber).length();
        String strCounter1 = "";
        String strCounter2 = "";
        counter1 = 0;
        counter2 = 0;
        
        for (int i = 0; i < sizeNumber; i++) {
            if (i < 3) {
                strCounter1 += strNumber.charAt(i);
                counter1 += Character.getNumericValue(strNumber.charAt(i));
            } else {
                strCounter2 += strNumber.charAt(i);
                counter2 += Character.getNumericValue(strNumber.charAt(i));
            }
        }
        if (counter1 == counter2) {
            System.out.println("Число " + initialNumber + " счастливое");
        } else {
            System.out.println("Число " + initialNumber + " обычное");
        }

        System.out.println("сумаа чисел " + strCounter1 + " равна " + counter1);
        System.out.println("сумаа чисел " + strCounter2 + " равна " + counter2);

        // Задание №10
        System.out.printf("%n%nЗадание №10.Вывод таблицы умножения Пифагора.%n%n");

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
