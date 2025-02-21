import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int digitCmp = 4;
        int attempt = 0;
        int numberAttempts = 3;
        while (attempt < numberAttempts){
            System.out.println("Угодайте число которое загадал компьютер. Попытка - " + (attempt + 1));
            int digitUser = console.nextInt();
            if (digitCmp == digitUser){
                System.out.println("Вы угадали загаданное число с " + (attempt + 1) + "й попытки и оно является - " + digitCmp);
                numberAttempts = 0;
            } else if (digitUser > digitCmp){
                System.out.println(digitUser + " больше загаданного");
            } else if (digitUser < digitCmp){
                System.out.println(digitUser + " меньше загаданного");
            }
            attempt++;
        }
    }
}