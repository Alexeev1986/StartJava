import java.math.BigInteger;

public class exp21 {
    public static void main(String[] args) {
        int StartC = -10;                                                   //переменная которая указывает на начальный интервал
        int count = StartC;
        boolean isEvenNumber;
        BigInteger sum1 = BigInteger.ZERO;
        BigInteger sum2 = BigInteger.ZERO;
        do {
            isEvenNumber = count % 2 == 0;
            if(isEvenNumber == true){                                       //проверяем четное ли число
                sum1 = sum1.add(BigInteger.valueOf(count));                 //если четное то накапливаем в переменную sum1
            } else if(isEvenNumber == false){
                sum2 = sum2.add(BigInteger.valueOf(count));                 //если не четное то накапливаем в переменную sum2
            }
            count++;
        } while (count <= 21);                                              //условие которое обозначает конец интервала
        System.out.println("В отрезке [" + StartC + ", " + (count - 1) + "] сумма четных чисел = " + sum1 + ", а нечетных = " + sum2);
    }
}
