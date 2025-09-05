package lesson2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1 = new Player();
    private Player player2 = new Player();

    public void setPlayerNames() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        player1.setPlayerName(console.next());
        System.out.print("\nВведите имя второго игрока: ");
        player2.setPlayerName(console.next());
    }

    public void startGame() {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(1, 10);
        boolean gameIsRunning = true;
        while (gameIsRunning) {
            System.out.print("\n" + player1.getPlayerName() + " - угадывает какое число загадал компьютер? ");
            player1.setPlayerGuess(console.nextInt());
            boolean winPlayer1 = isGuessed(player1.getPlayerGuess(), targetNumber);
            if (winPlayer1) {
                System.out.println("\n" + player1.getPlayerName() + " победил!");
                gameIsRunning = false;
                continue;
            }
            System.out.print("\n" + player2.getPlayerName() + " - угадывает какое число загадал компьютер? ");
            player2.setPlayerGuess(console.nextInt());
            boolean winPlayer2 = isGuessed(player2.getPlayerGuess(), targetNumber);
            if (winPlayer2) {
                System.out.println("\n" + player2.getPlayerName() + " победил!");
                gameIsRunning = false;
            }
        }
    }

    public boolean isGuessed(int playerNumber, int targetNumber) {
        if (playerNumber > targetNumber) {
            System.out.print("\n" + playerNumber + " больше того, что загадал компьютер");
            return false;
        } else if (playerNumber < targetNumber) {
            System.out.print("\n" + playerNumber + " меньше того, что загадал компьютер");
            return false;
        } else {
            return true;
        }
    }
}
