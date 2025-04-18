import java.math.BigDecimal;
import java.math.RoundingMode;

public class expBigDecimal {
    public static void main (String[] args){
        System.out.println("\nЗадание №9");

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
    }
}