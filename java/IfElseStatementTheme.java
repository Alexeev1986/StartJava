import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        // Задание 1
        System.out.printf("%nЗадание №1. Перевод псевдокода на язык Java.%n%n");

        boolean isGender = true;
        if (!isGender) { 
            System.out.println("Мужской пол");
        } else {
            System.out.println("Женский пол");
        }

        int age = 15;
        if (age > 18) { 
            System.out.println("Совершеннолетиее достигнуто вам " + age);
        } else {
            System.out.println("До совершеннолетия осталось " + (18 - age) + " года");
        }

        double height = 1.9;
        if (height < 1.8) { 
            System.out.println("Ваш рост ниже 1.8 метра и составляет " + height);
        } else {
            System.out.println("Ваш рост выше 1.8 метра и составляет " + height);
        }

        char firstLetterName = "Anton".charAt(0);
        if (firstLetterName == "M".charAt(0)) { 
            System.out.println("Ваше имя начина начинается на букву M");
        } else if (firstLetterName == "I".charAt(0)) {
            System.out.println("Ваше имя начина начинается на букву I");
        } else {
            System.out.println("Ваше имя начина начинается на букву " + firstLetterName);
        }

        // Задание 2
        System.out.printf("%nЗадание №2. Поиск большего числа.%n%n");

        int numberOne = 43;
        int numberTwo = 83;
        if (numberOne > numberTwo) { 
            System.out.println("Число " + numberOne + " больше числа " + numberTwo);
        } else if (numberTwo > numberOne) {
            System.out.println("Число " + numberOne + " меньше числа " + numberTwo);
        } else if (numberOne == numberTwo) {
            System.out.println("Число " + numberOne + " равно числу " + numberTwo);
        }

        // Задание 3
        System.out.printf("%nЗадание №3 Проверка числа.%n%n");

        int number = -5;
        if (number == 0) { 
            System.out.println("Выбранное вами число является нулем.");
        } else if (number > 0) {
            boolean isNumberEven = number % 2 == 0;
            if (isNumberEven) { 
                System.out.println("Число " + number + " является положительным и четным");
            } else {
                System.out.println("Число " + number + " является положительным и нечетным");
            }
        } else { 
            boolean isNumberEven = number % 2 == 0;
            if (isNumberEven) { 
                System.out.println("Число " + number + " является отрицательным и четным");
            } else {
                System.out.println("Число " + number + " является отрицательным и нечетным");
            }
        }

        // Задание 4
        System.out.printf("%nЗадание №4 Поиск одинаковых цифр в числах.%n%n");

        numberOne = 444;
        numberTwo = 243;
        int hundredNumber1 = (numberOne / 100) % 10;
        int tenNumber1 = (numberOne / 10) % 10;
        int onesNumber1 = numberOne % 10;

        int hundredNumber2 = (numberTwo / 100) % 10;
        int tenNumber2 = (numberTwo / 10) % 10;
        int onesNumber2 = numberTwo % 10;

        if (hundredNumber1 == hundredNumber2 & tenNumber1 == tenNumber2 & onesNumber1 == onesNumber2) { 
            System.out.println("Выбранные вами числа равны");
        } else if (hundredNumber1 == hundredNumber2 || tenNumber1 == tenNumber2 ||
                onesNumber1 == onesNumber2) {
            System.out.println("Выбранные числа : " + numberOne + " и " + numberTwo);
            if (hundredNumber1 == hundredNumber2) { 
                System.out.println("Одинаковый сотни: " + hundredNumber1 + " и " + hundredNumber2);
            }
            if (tenNumber1 == tenNumber2) { 
                System.out.println("Одинаковый десятки: " + tenNumber1 + " и " + tenNumber2);
            }
            if (onesNumber1 == onesNumber2) { 
                System.out.println("Одинаковый единицы: " + onesNumber1 + " и " + onesNumber2);
            }
        } else {
            System.out.println("В выбранных вами числах нет одинаковых цифр");
        }

        // Задание 5
        System.out.printf("%nЗадание №5 Определение символа по его коду.%n%n");

        char symbol = '\u0057';
        if (Character.isUpperCase(symbol)) {
            System.out.println(symbol + " - большая буква");
        } else if (Character.isLetter(symbol)) {
            System.out.println(symbol + " - маленькая буква");
        } else if (Character.isDigit(symbol) | Character.isUpperCase(symbol)) {
            System.out.println(symbol + " - это число");
        } else {
            System.out.println(symbol + " - это иной символ");
        }

        // Задание 6
        System.out.printf("%nЗадание №6 Подсчет начисленных банком процентов %n%n");

        double deposit = 321123.59;
        double depositInterestRate = 0;
        double interestRate = 0;
        if (deposit < 100000) {
            interestRate = 0.05;
        } else if (deposit >= 100000 & deposit <= 300000) {
            interestRate = 0.07;
        } else if (deposit > 300000) {
            interestRate = 0.10;
        }
        depositInterestRate = deposit * interestRate;
        System.out.println("Сумма вашего вклада составляет = " + deposit);
        System.out.println("Процентная ставка =" + String.format("%.2f", depositInterestRate));
        System.out.println("Итоговая сумма =" + String.format("%.2f", depositInterestRate + deposit));

        // Задание 7
        System.out.printf("%nЗадание №7 Определение оценки по предметам.%n%n");

        float historyGrade = 59F;
        float programmingGrade = 92F;
        short historyEvaluation = 2;
        short programmingEvaluation = 2;

        if (historyGrade > 60 & historyGrade <= 73) { 
            historyEvaluation = 3;
        } else if (historyGrade > 73 & historyGrade <= 91) {
            historyEvaluation = 4;
        } else if (historyGrade > 91) {
            historyEvaluation = 5;
        }

        if (programmingGrade > 60 & programmingGrade <= 73) { 
            programmingEvaluation = 3;
        } else if (programmingGrade > 73 & programmingGrade <= 91) {
            programmingEvaluation = 4;
        } else if (programmingGrade > 91) {
            programmingEvaluation = 5;
        }
        System.out.println("История(" + historyGrade +
                ") оценка - " + historyEvaluation);
        System.out.println("Программирование(" + programmingGrade +
                ") оценка - " + programmingEvaluation);

        float avarageScore = (historyEvaluation + programmingEvaluation) / 2;
        System.out.println("Средний балл по предметам = " + (avarageScore));

        float avaregItem = (historyGrade + programmingGrade) / 2;
        System.out.println("Средний процент по предметам = " + avaregItem + "%");

        // Задание 8
        System.out.printf("%nЗадание №8 Расчет годовой прибыли.%n%n");

        double soldMonthly = 13025.233;
        double rentMonthly = 5123.018;
        double costOfProduction = 9001.729;
        double profitYear = (soldMonthly * 12) - ((rentMonthly * 12) + (costOfProduction * 12));
        if (profitYear > 0) {
            System.out.println("Прибыль за год: +" + String.format("%.2f", profitYear));
        } else {
            System.out.println("Прибыль за год: " + String.format("%.2f", profitYear));
        }

        // Задание 9
        
        System.out.printf("%nЗадание №9 Подсчет начисленных банком процентов с помощью BigDecimal. %n%n");

        BigDecimal depositBd = new BigDecimal("321123.59");
        BigDecimal depositLimit1 = BigDecimal.valueOf(100000);
        BigDecimal depositLimit2 = BigDecimal.valueOf(300000);
        double rate = 0;
        if (depositBd.compareTo(depositLimit1) < 0) {
            rate = 0.05;
        } else if (depositBd.compareTo(depositLimit1) > 0 & depositBd.compareTo(depositLimit2) < 0) {
            rate = 0.07;
        } else if (depositBd.compareTo(depositLimit2) > 0) {
            rate = 0.1;
        }
        BigDecimal rateBd = BigDecimal.valueOf(rate);
        BigDecimal depositInterestRateBd = depositBd.multiply(rateBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal sumBd = depositInterestRateBd.add(depositBd);
        System.out.println("Сумма вашего вклада составляет = " + depositBd);
        System.out.println("Процентная ставка = " + depositInterestRateBd);
        System.out.println("Итоговая сумма = " + sumBd);

        // Задание 10

        System.out.printf("%nЗадание №10 Расчет годовой прибыли с помощью BigDecimal.%n%n");

        BigDecimal soldMonthlyBd = new BigDecimal("12025.233");
        BigDecimal rentMonthlyBd = new BigDecimal("5123.018");
        BigDecimal costOfProductionBd = new BigDecimal("9001.729");
        BigDecimal monthCountBd = BigDecimal.valueOf(12);
        
        BigDecimal soldYearBd = soldMonthlyBd.multiply(monthCountBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal rentYearBd = rentMonthlyBd.multiply(monthCountBd).setScale(2, RoundingMode.HALF_UP);

        BigDecimal costOfProductionYearBd = 
                costOfProductionBd.multiply(monthCountBd).setScale(2, RoundingMode.HALF_UP);

        BigDecimal profitYearBd = soldYearBd.subtract(rentYearBd.add(costOfProductionYearBd));
        if (profitYearBd.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Прибыль за год: +" + String.format("%.2f", profitYearBd));
        } else {
            System.out.println("Прибыль за год: " + String.format("%.2f", profitYearBd));
        }
    }
}