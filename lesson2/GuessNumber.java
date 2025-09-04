package lesson2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public void startGame(Player player1, Player player2) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(1, 10);
        boolean endGame = true;
        while (endGame) {
            System.out.print("\n" + player1.getPlayerName() + " - угадывает какое число загадал компьютер? ");
            player1.setPlayerGuess(console.nextInt());
            boolean winPlayer1 = isGuessCorrect(player1.getPlayerGuess(), targetNumber);
            if (!winPlayer1) {
                System.out.println("\n" + player1.getPlayerName() + " победил!");
                endGame = false;
                continue;
            }
            System.out.print("\n" + player2.getPlayerName() + " - угадывает какое число загадал компьютер? ");
            player2.setPlayerGuess(console.nextInt());
            boolean winPlayer2 = isGuessCorrect(player2.getPlayerGuess(), targetNumber);
            if (!winPlayer2) {
                System.out.println("\n" + player2.getPlayerName() + " победил!");
                endGame = false;
            }
        }
    }

    public boolean isGuessCorrect(int playerNumber, int targetNumber) {
        if (playerNumber > targetNumber) {
            System.out.print("\n" + playerNumber + " больше того, что загадал компьютер");
            return true;
        } else if (playerNumber < targetNumber) {
            System.out.print("\n" + playerNumber + " меньше того, что загадал компьютер");
            return true;
        } else {
            return false;
        }
    }
}
