package racingcar;

public class Player {
    private String PlayerName;
    private int Movement;

    Player(String name) {
        this.PlayerName = name;
        this.Movement = 0;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public int getMovement() {
        return Movement;
    }

    public void moveForward(int randomNum) {
        if (randomNum >= 4) ++Movement;
    }
}
