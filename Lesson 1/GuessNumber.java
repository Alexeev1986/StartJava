import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int targetNumber = 4;
        int attempt = 0;
        int attemptCount = 3;
        for (int i = 0; i < attemptCount; i++) {
            System.out.println("Угадайте число которое загадал компьютер. Попытка - " + (attempt + 1));
            int playerNumber = console.nextInt();
            if (targetNumber == playerNumber) {
                System.out.println("Вы угадали загаданное число с " + (i + 1) + 
                        "й попытки и оно является - " + targetNumber);
                break;
            }
            if (playerNumber > targetNumber) {
                System.out.println(playerNumber + " больше загаданного");
            } else {
                System.out.println(playerNumber + " меньше загаданного");
            }
        }
    }
}