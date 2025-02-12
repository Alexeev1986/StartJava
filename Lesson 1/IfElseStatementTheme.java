import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        // Задание 1
        System.out.printf("\nЗадание №1. Перевод псевдокода на язык Java.%n%n");

        boolean gender = true;
        if (!gender) { 
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
        System.out.printf("\nЗадание №2. Поиск большего числа.%n%n");

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
        System.out.printf("\nЗадание №3 Проверка числа.%n%n");

        int number = 0;
        if (number == 0) { 
            System.out.println("Выбранное вами число является нулем.");
        } else if (number > 0) {
            boolean isNumberEven = number % 2 == 0;
            if (isNumberEven == true) { 
                System.out.println("Число " + number + " является положительным и четным");
            } else if (isNumberEven == false) {
                System.out.println("Число " + number + " является положительным и нечетным");
            }
        } else if (number < 0) { 
            boolean isNumberEven = number % 2 == 0;
            if (isNumberEven == true) { 
                System.out.println("Число " + number + " является отрицательным и четным");
            } else if (isNumberEven == false) {
                System.out.println("Число " + number + " является отрицательным и нечетным");
            }
        }

        // Задание 4
        System.out.printf("\nЗадание №4 Поиск одинаковых цифр в числах.%n%n");

        int number1 = 523;
        int number2 = 223;
        int hundredNumber1 = (number1 / 100) % 10;
        int tenNumber1 = (number1 / 10) % 10;
        int onesNumber1 = number1 % 10;

        int hundredNumber2 = (number2 / 100) % 10;
        int tenNumber2 = (number2 / 10) % 10;
        int onesNumber2 = number2 % 10;

        if (hundredNumber1 == hundredNumber2 & tenNumber1 == tenNumber2 & onesNumber1 == onesNumber2) { 
            System.out.println("Выбранные вами числа равны");
        } else if (hundredNumber1 == hundredNumber2 || tenNumber1 == tenNumber2 || onesNumber1 == onesNumber2) {
            System.out.println("Выбранные числа : " + number1 + " и " + number2);
        }
        if (hundredNumber1 == hundredNumber2) { 
            System.out.println("Одинаковый сотни: " + hundredNumber1 + " и " + hundredNumber2);
        }
        if (tenNumber1 == tenNumber2) { 
            System.out.println("Одинаковый десятки: " + tenNumber1 + " и " + tenNumber2);
        }
        if (onesNumber1 == onesNumber2) { 
            System.out.println("Одинаковый единицы: " + onesNumber1 + " и " + onesNumber2);
        } else {
            System.out.println("В выбранных вами числах нет одинаковых цифр");
        }

        // Задание 5
        System.out.printf("\nЗадание №5 Определение символа по его коду.%n%n");

        char symbol = '\u0057';
        boolean isLetter = Character.isLetter(symbol);
        boolean isLetterUp = Character.isUpperCase(symbol);
        boolean isNumber = Character.isDigit(symbol);

        if (isLetter == true) { 
            if (isLetterUp == true) {
                System.out.println(symbol + " - большая буква");
            } else {
                System.out.println(symbol + " - маленькая буква");
            }
        } else if (isNumber == true) {
            System.out.println(symbol + " - это число");
        } else {
            System.out.println(symbol + " - это иной символ");
        }

        // Задание 6
        System.out.printf("\nЗадание №6 Подсчет начисленных банком процентов %n%n");

        double deposit = 321123.59;
        double depositInterestRate = 0;
        double interestRate = 0;
        if (deposit < 100000) {
            depositInterestRate = deposit * 0.05;
            interestRate = 0.05;
        } else if (deposit >= 100000 & deposit <= 300000) {
            depositInterestRate = deposit * 0.07;
            interestRate = 0.07;
        } else if (deposit > 300000) {
            depositInterestRate = deposit * 0.1;
            interestRate = 0.10;
        }
    
        System.out.println("Сумма вашего вклада составляет = " + deposit);
        System.out.println("Процентная ставка =" + String.format("%.2f", depositInterestRate));
        System.out.println("Итоговая сумма =" + String.format("%.2f", depositInterestRate + deposit));

        // Задание 7
        System.out.printf("\nЗадание №7 Определение оценки по предметам.%n%n");

        float percentHistoryEvaluation = 59F;
        float percentProgrammingEvaluation = 92F;
        short historyEvaluation = 0;
        short programmingEvaluation = 0;

        if (percentHistoryEvaluation <= 60) { 
            historyEvaluation = 2;
        } else if (percentHistoryEvaluation > 60 & percentHistoryEvaluation <= 73) { 
            historyEvaluation = 3;
        } else if (percentHistoryEvaluation > 73 & percentHistoryEvaluation <= 91) {
            historyEvaluation = 4;
        } else if (percentHistoryEvaluation > 91) {
            historyEvaluation = 5;
        }

        if (percentProgrammingEvaluation <= 60) {
            programmingEvaluation = 2;
        } else if (percentProgrammingEvaluation > 60 & percentProgrammingEvaluation <= 73) { 
            programmingEvaluation = 3;
        } else if (percentProgrammingEvaluation > 73 & percentProgrammingEvaluation <= 91) {
            programmingEvaluation = 4;
        } else if (percentProgrammingEvaluation > 91) {
            programmingEvaluation = 5;
        }

        System.out.println("История(" + Math.round(percentHistoryEvaluation) + ") оценка - " + historyEvaluation);
        System.out.println("Программирование(" + Math.round(percentProgrammingEvaluation) + ") оценка - " + programmingEvaluation);

        float avarageScore = (historyEvaluation + programmingEvaluation) / 2;
        System.out.println("Средний балл по предметам = " + (avarageScore));

        float avaregItem = (percentHistoryEvaluation + percentProgrammingEvaluation) / 2;
        System.out.println("Средний процент по предметам = " + avaregItem + "%");

        // Задание 8
        System.out.printf("\nЗадание №8 Расчет годовой прибыли.%n%n");

        double soldMonthly = 13025.233;
        double rentMonthly = 5123.018;
        double costOfProduction = 9001.729;
        double soldYear = soldMonthly * 12;
        double rentYear = rentMonthly * 12;
        double costOfProductionYear = costOfProduction * 12;
        double profitYear = soldYear - (rentYear + costOfProductionYear);
        if (profitYear > 0) {
            System.out.println("Прибыль за год: +" + String.format("%.2f", profitYear));
        } else {
            System.out.println("Прибыль за год: " + String.format("%.2f", profitYear));
        }

        // Задание 9
        
        System.out.printf("\nЗадание №9 Подсчет начисленных банком процентов с помощью BigDecimal. %n%n");

        BigDecimal depositBd = new BigDecimal("321123.59");
        BigDecimal depositLimit1 = new BigDecimal("100000");
        BigDecimal depositLimit2 = new BigDecimal("300000");
        BigDecimal rate1 = new BigDecimal("0.05");
        BigDecimal rate2 = new BigDecimal("0.07");
        BigDecimal rate3 = new BigDecimal("0.1");

        if (depositBd.compareTo(depositLimit1) < 0) {
            BigDecimal depositInterestRateBd = depositBd.multiply(rate1).setScale(2, RoundingMode.HALF_UP);
            BigDecimal sumBd = depositInterestRateBd.add(depositBd);
            System.out.println("Сумма вашего вклада составляет = " + depositBd);
            System.out.println("Процентная ставка = " + depositInterestRateBd);
            System.out.println("Итоговая сумма = " + sumBd);
        } else if (depositBd.compareTo(depositLimit1) > 0 & depositBd.compareTo(depositLimit2) < 0) {
            BigDecimal depositInterestRateBd = depositBd.multiply(rate2).setScale(2, RoundingMode.HALF_UP);
            BigDecimal sumBd = depositInterestRateBd.add(depositBd);
            System.out.println("Сумма вашего вклада составляет = " + depositBd);
            System.out.println("Процентная ставка = " + depositInterestRateBd);
            System.out.println("Итоговая сумма = " + sumBd);
        } else if (depositBd.compareTo(depositLimit2) > 0) {
            BigDecimal depositInterestRateBd = depositBd.multiply(rate3).setScale(2, RoundingMode.HALF_UP);
            BigDecimal sumBd = depositInterestRateBd.add(depositBd);
            System.out.println("Сумма вашего вклада составляет = " + depositBd);
            System.out.println("Процентная ставка = " + depositInterestRateBd);
            System.out.println("Итоговая сумма = " + sumBd);
        }

        // Задание 10

        System.out.printf("\nЗадание №10 Расчет годовой прибыли с помощью BigDecimal.%n%n");

        BigDecimal soldMonthlyBd = new BigDecimal("12025.233");
        BigDecimal rentMonthlyBd = new BigDecimal("5123.018");
        BigDecimal costOfProductionBd = new BigDecimal("9001.729");
        BigDecimal monthCountBd = new BigDecimal("12");
        
        BigDecimal soldYearBd = soldMonthlyBd.multiply(monthCountBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal rentYearBd = rentMonthlyBd.multiply(monthCountBd).setScale(2, RoundingMode.HALF_UP);

        BigDecimal costOfProductionYearBd = costOfProductionBd.multiply(monthCountBd).setScale(2, RoundingMode.HALF_UP);

        BigDecimal profitYearBd = soldYearBd.subtract(rentYearBd.add(costOfProductionYearBd));
        if (profitYearBd.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Прибыль за год: +" + String.format("%.2f", profitYearBd));
        } else {
            System.out.println("Прибыль за год: " + String.format("%.2f", profitYearBd));
        }
    }
}