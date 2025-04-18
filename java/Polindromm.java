public class Polindromm {
    public static void main(String[] args) {
        int originalNumber = 1234321;
        int tmp = originalNumber;
        int reversNumber = 0;
        while (tmp > 0) {
            int remainder = tmp % 10;
            reversNumber = (reversNumber * 10) + remainder;
            tmp /= 10;
        }
        if (originalNumber == reversNumber) {
            System.out.println("Число " + originalNumber + " является палиндромом");
        } else {
            System.out.println("Число " + originalNumber + " не является палиндромом");
        }

    }
}