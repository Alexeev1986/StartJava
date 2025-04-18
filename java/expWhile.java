import java.math.BigInteger;

public class expWhile {
    public static void main (String[] args){
        int count = 0;
        while (count <= 5) {
            sum = sum.add(BigInteger.valueOf(count));
            System.out.println("Сумма чисел =" + sum);
            count++;
       }
    }
}