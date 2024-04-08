package racingcar.unit;

public class Car {
    private final String name;
    private int stat;

    Car(String name) {
        this.name = name;
        this.stat = 0;
    }

    public void printResult(Cars carList) {
        carList.stream().forEach(car ->
                System.out.println(car.getName() + " : " + "-".repeat(car.getStat()))
        );
    }

    public void goForward() { stat++; }
    public String getName() { return name; }
    public int getStat() { return stat; }
}
