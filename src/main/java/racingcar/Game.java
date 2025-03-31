package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Car> players = new ArrayList<Car>();
    private int count;

    public void addPlayer(String name) {
        this.players.add(new Car(name));
    }

    public void setCount(String countString) {
        try {
            this.count = Integer.parseInt(countString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    public String checkWinner() {
        int highPoint = 0;

        String winners = "";

        for (Car car : this.players) {
            if (car.point >= highPoint) { highPoint = car.point; }
        }

        for (Car car : this.players) {
            if (car.point == highPoint) {
                winners = winners + car.name + ", ";
            }
        }
        return winners;
    }

    public void run() {
        for (int i = 0; i < this.count; i++) {
            for (Car car : this.players) {
                car.run();
                car.printCurrentPoint();
            }
            System.out.println("");
        }
    }
}
