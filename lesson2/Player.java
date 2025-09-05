package lesson2;

public class Player {
    private String name;
    private int guess;

    public void setPlayerName(String name) {
        this.name = name;
    }

    public String getPlayerName() {
        return name;
    }

    public void setPlayerGuess(int guess) {
        this.guess = guess;
    }

    public int getPlayerGuess() {
        return guess;
    }
}
