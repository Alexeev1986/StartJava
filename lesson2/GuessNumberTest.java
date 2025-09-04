package lesson2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(console.next());
        System.out.print("\nВведите имя второго игрока: ");
        Player player2 = new Player(console.next());
        GuessNumber game = new GuessNumber();
        String answer;
        do {
            game.startGame(player1, player2);
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = console.next().trim();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
