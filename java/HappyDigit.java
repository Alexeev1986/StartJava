public class HappyDigit {
    public static void main(String[] args) {
        int originalNumber = 123321;
        int firstThreeDigits = originalNumber / 1000;
        int lastThreeDigits = originalNumber % 1000;
        int firstThreeDigitsSum = 0;
        int lastThreeDigitsSum = 0;
        int divider = 10;
        System.out.println(firstThreeDigits + "   " + lastThreeDigits);
        for (int i = 0; i < 3; i++){
            firstThreeDigitsSum += firstThreeDigits % 10;
            firstThreeDigits /= 10;
            lastThreeDigitsSum += lastThreeDigits % 10;
            lastThreeDigits /= 10;
            System.out.println(i);
        }
        
        System.out.println(firstThreeDigitsSum + "   " + lastThreeDigitsSum);
        if (firstThreeDigitsSum == lastThreeDigitsSum) {
            System.out.println("Число " + originalNumber + " Счастливое число");
        } else {
            System.out.println("Число " + originalNumber + " не является Счастливым числом");
        }
    }
}
