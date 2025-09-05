package lesson2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        GuessNumber game = new GuessNumber();
        game.setPlayerNames();
        String answer;
        do {
            game.startGame();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = console.next().trim();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
