package lesson2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(1, 10);
        while (true) {
            System.out.print("\n" + player1.getName() + " - угадывает какое число загадал компьютер? ");
            player1.setGuess(console.nextInt());
            boolean isWinPlayer1 = isGuessed(player1, targetNumber);
            if (isWinPlayer1) {
                break;
            }
            System.out.print("\n" + player2.getName() + " - угадывает какое число загадал компьютер? ");
            player2.setGuess(console.nextInt());
            boolean isWinPlayer2 = isGuessed(player2, targetNumber);
            if (isWinPlayer2) {
                break;
            }
        }
    }

    public boolean isGuessed(Player player, int targetNumber) {
        if (player.getGuess() != targetNumber) {
            System.out.print("\n" + player.getGuess() +
                    (player.getGuess() > targetNumber ? " больше " : " меньше ") + "того, что загадал компьютер");
            return false;
        }
        System.out.println("\n" + player.getName() + " победил!");
        return true;
    }
}
