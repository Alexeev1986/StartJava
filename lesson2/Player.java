package lesson2;

public class Player {
    private final String  playerName;
    private int playerGuess;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerGuess(int playerGuess) {
        this.playerGuess = playerGuess;
    }

    public int getPlayerGuess() {
        return playerGuess;
    }

    public String getPlayerName() {
        return playerName;
    }
}
