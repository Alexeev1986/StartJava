public class IfElseStatementTheme {
    public static void main (String[] args){
        //Задание 1
        System.out.println("\nЗадание №1");
        int yGender = 1;     // переменная Gender определяет: пол если 1 то мужской, если 0 то женский
        boolean isGender = yGender == 1;
        if(isGender == true){
            System.out.println("Мужской пол");
        } else if(isGender == false){
            System.out.println("Женский пол");
        }
        int yAge = 22;       // переменная yAge устанавливает ваш возраст
        if(yAge >= 18){
            System.out.println("Совершеннолетиее достигнуто вам " + yAge);
        } else if(yAge < 18){
            System.out.println("До совершеннолетия осталось" + (18 - yAge));
        }
        double yHeight = 1.9;       // переменная yHeight устанавливает ваш рост
        if(yHeight < 1.8){
            System.out.println("Ваш рост ниже 1.8 метра и составляет " + yHeight);
        } else if(yHeight > 1.8){
            System.out.println("Ваш рост выше 1.8 метра и составляет " + yHeight);
        }
        String mName = "Anton";       // переменная которая хранит ваше имя
        String LatterM = "M";
        String LatterI = "I";
        char FirstLetterName = mName.charAt(0);      //переменная которая хранит 1ю букву вашего имени
        if(FirstLetterName == LatterM.charAt(0) ){
            System.out.println("Ваше имя начина начинается на букву M");
        } else if(FirstLetterName == LatterM.charAt(0)){
            System.out.println("Ваше имя начина начинается на букву I");
        } else{
            System.out.println("Ваше имя не начина начинается на букву M и I,  но оно начинается на букву " + FirstLetterName);
        }
        //Задание 2
        System.out.println("\nЗадание №2");
        int x1 = 43;    // в переменных x1 и x2 хранятся два числа
        int x2 = 83;
        System.out.println("Вы выбрали два числа: 1-е число = "  + x1 + " ; 2-е число = " + x2 );
        if(x1 > x2){
            System.out.println("Наиболшее 1 е число " + x1);
        } else if(x2 > x1){
            System.out.println("Наиболшее 2 е число " + x2);
        } else if(x1 == x2){
            System.out.println("1-е и 2-е число равны!");
        }
        //Задание 3
        System.out.println("\nЗадание №3");
        int x = 0;              //Переменная хранит число
        if(x == 0){
            System.out.println("Выбранное вами число является нулем.");
        } else if(x > 0){
            boolean isEvenNumber = x % 2 == 0;
            if(isEvenNumber == true){
                System.out.println("Число " + x + " является положительным и четным");
            } else if(isEvenNumber == false){
                System.out.println("Число " + x + " является положительным и нечетным");
            }
        }else if(x < 0){
            boolean isEvenNumber = x % 2 == 0;
            if(isEvenNumber == true){
                System.out.println("Число " + x + " является отрицательным и четным");
            } else if(isEvenNumber == false){
                System.out.println("Число " + x + " является отрицательным и нечетным");
            }
        }
        //Задание 4
        System.out.println("\nЗадание №4");
        x1 = 523;                   //присваиваем значение 2м переменным
        x2 = 223;
        int ones1, tens1, hundreds1;    //переменные которые хранят: еденицы, десятки, сотни.
        int ones2, tens2, hundreds2;
        ones1 = x1 % 10;                
        tens1 = (x1 / 10) % 10;
        hundreds1 = (x1 / 100) % 10;
        ones2 = x2 % 10;
        tens2 = (x2 / 10) % 10;
        hundreds2 = (x2 / 100) % 10;
        if(hundreds1 == hundreds2 & tens1 == tens2 & ones1 == ones2){
            System.out.println("Выбранные вами числа равны");
        }else if(hundreds1 == hundreds2 || tens1 == tens2 || ones1 == ones2){
                System.out.println("Выбранные числа : " + x1 + " и " + x2);
                if(hundreds1 == hundreds2){
                    System.out.println("Одинаковый сотни: " + hundreds1 + " и " + hundreds2);
                }
                if(tens1 == tens2){
                    System.out.println("Одинаковый десятки: " + tens1 + " и " + tens2);
                }
                if(ones1 == ones2){
                    System.out.println("Одинаковый единицы: " + ones1 + " и " + ones2);
                }
                
        }else{
            System.out.println("В выбранных вами числах нет одинаковых цифр");
            }
        //Задание 5
        System.out.println("\nЗадание №5");
        char strX = '$';
        boolean isLetter = Character.isLetter(strX);            //Переменная для распознания Букв
        boolean isLetterUp = Character.isUpperCase(strX);       //Переменная для распознания Регистра Букв
        boolean isNumber = Character.isDigit(strX);             //Переменная для распознания Чисел

        if(isLetter == true){
            if(isLetterUp == true){
                System.out.println(strX + " - большая буква");
            }else{
                System.out.println(strX + " - маленькая буква");
            }
        }else if(isNumber == true){
            System.out.println(strX + " - это число");
        }else{
            System.out.println(strX + " - это иной символ");
        }
        //Задание 6
        System.out.println("\nЗадание №6");
        double SumDepos = 321123.59;    //Переменная хранит сумму депозита
        double DepPr = 0;               //Переменная хранит  сумм процентов за год
        double DepPrSt = 0;             //Переменная хранит процентную ставку
        if(SumDepos < 100000){
            DepPr = SumDepos * 0.05;
            DepPrSt = 0.05;
        }else if(SumDepos >= 100000 & SumDepos <= 300000){
            DepPr = SumDepos * 0.07;
            DepPrSt = 0.07;
        }else if(SumDepos > 300000){
            DepPr = SumDepos * 0.1;
            DepPrSt = 0.10;
        }
        double NewSumDeposM = SumDepos + (DepPr / 12);      //Переменная хранит Сумму депозита + месячная прибыль от процентов
        double NewSumDeposY = SumDepos + DepPr;             //Переменная хранит Сумму депозита + годовая прибыль от процентов
        System.out.println("Сумма вашего вклада составляет = " + SumDepos);
        System.out.println("Процентная ставка =" + DepPrSt + "%");
        System.out.println("Сумма начисленного процента в месяц =" + String.format("%.2f", DepPr / 12));
        System.out.println("Сумма начисленного процента за год =" + String.format("%.2f", DepPr));
        System.out.println("Итого за месяц: " + String.format("%.2f", NewSumDeposM));
        System.out.println("Итого за год: " + String.format("%.2f", NewSumDeposY));
        //Задание 7
        System.out.println("\nЗадание №7");
        float PrFinalScore1 = 59;
        float PrFinalScore2 = 92;
        short Score1 = 0;
        short Score2 = 0;
        if(PrFinalScore1 <= 60){
            Score1 = 2;
        }else if(PrFinalScore1 > 60 & PrFinalScore1 <= 73){ 
            Score1 = 3;
        }else if(PrFinalScore1 > 73 & PrFinalScore1 <= 91){
            Score1 = 4;
        }else if(PrFinalScore1 > 91){
            Score1 = 5;
        }
        if(PrFinalScore2 <= 60){
            Score2 = 2;
        }else if(PrFinalScore2 > 60 & PrFinalScore2 <= 73){ 
            Score2 = 3;
        }else if(PrFinalScore2 > 73 & PrFinalScore2 <= 91){
            Score2 = 4;
        }else if(PrFinalScore2 > 91){
            Score2 = 5;
        }
        System.out.println("История(" + PrFinalScore1 + ") оценка - " + Score1);
        System.out.println("Программирование(" + PrFinalScore2 + ") оценка - " + Score2);
        float AvarageScore = (Score1 + Score2) / 2;
        System.out.println("Средний балл по предметам = " + Math.round(AvarageScore));
        float AvaregePr = (PrFinalScore1 + PrFinalScore2) /2;
        System.out.println("Средний процент по предметам = " + AvaregePr + "%");
        //Задание 8
        System.out.println("\nЗадание №8");
        double SoldMonthly = 13025.233;
        double RentMonthly = 5123.018;
        double CostOfProduction = 9001.729;
        double SoldYear = SoldMonthly * 12;
        double RentYear = RentMonthly * 12;
        double CostOfProductionYear = CostOfProduction * 12;
        double ProfitYear = SoldYear - (RentYear + CostOfProductionYear);
        if(ProfitYear > 0){
            System.out.println("Прибыль за год: +" + String.format("%.2f",ProfitYear));
        }else{
            System.out.println("Прибыль за год: " + String.format("%.2f",ProfitYear));
        }
    }
}