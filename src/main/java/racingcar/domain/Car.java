package racingcar.domain;

public class Car {
    private String name;
    private int advanceCount = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAdvanceCount() {
        return advanceCount;
    }

    public void setAdvanceCount(int advanceCount) {
        this.advanceCount = advanceCount;
    }

    public void advance() {
        ++advanceCount;
    }
}
