import java.math.BigInteger;
import java.util.Scanner;

public class expFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вычисления его факториала: ");
        int num = scanner.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Факториал числа " + num + " равен " + factorial);
    }
}