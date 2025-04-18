public class exp4 {
    public static void main (String[] args){
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
    }
}