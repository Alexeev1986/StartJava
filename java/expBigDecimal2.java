import java.math.BigDecimal;
import java.math.RoundingMode;

public class expBigDecimal2 {
    public static void main (String[] args){
        System.out.println("\nЗадание №10");


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
