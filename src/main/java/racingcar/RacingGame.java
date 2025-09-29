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
}