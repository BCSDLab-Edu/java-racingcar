package racingcar;

public class Car implements Vehicle{
    private int winNum = 0;
    private String name = "";

    //Constructer
    Car(String name) {
        this.name = name;
    }
    Car(String name, int winNum) { //overloading
        this.name = name;
        this.winNum = winNum;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int getWinNum() {
        return  this.winNum;
    }
    @Override
    public void increaseWinNum() {
        winNum++;
    }
    @Override
    public int getRandomFactor() {return 4;}
}