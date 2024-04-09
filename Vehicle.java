package racingcar;

public interface Vehicle {
    int winNum = 0;
    String name = "";

    public String getName();
    public int getWinNum();
    public void increaseWinNum();
    public int getRandomFactor();
}