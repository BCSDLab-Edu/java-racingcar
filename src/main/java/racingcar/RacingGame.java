package racingcar;
import java.util.*;
public class RacingGame {
    private List<Car> cars;
    private int tryCount;
    public void start() {
        cars = Input.readCarNames();
        tryCount = Input.readTryCount();
        System.out.println("\n실행 결과");
        for (int i = 0; i < tryCount; i++) {
            raceOnce();
            Output.printRoundResult(cars);
        }
        List<Car> winners = getWinners();
        Output.printWinners(winners);
    }
    private List<Car> getWinners() {
        int maxPosition = cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car);
            }
        }
        return winners;
    }
}