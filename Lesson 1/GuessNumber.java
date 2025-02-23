import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cmpNumber = 4;
        int attempt = 0;
        int numberAttempts = 3;
        while (attempt < numberAttempts) {
            System.out.println("Угодайте число которое загадал компьютер. Попытка - " + (attempt + 1));
            int playerNumber = console.nextInt();
            if (cmpNumber == playerNumber) {
                System.out.println("Вы угадали загаданное число с " + (attempt + 1) + 
                        "й попытки и оно является - " + cmpNumber);
                numberAttempts = 0;
            }
            if (playerNumber > cmpNumber) System.out.println(playerNumber + " больше загаданного");
            if (playerNumber < cmpNumber) System.out.println(playerNumber + " меньше загаданного");
            attempt++;
        }
    }
}