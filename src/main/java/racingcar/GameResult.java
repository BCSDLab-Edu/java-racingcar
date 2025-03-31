package racingcar;

import java.util.List;

public class GameResult {
    private List<Car> winners;

    public List<Car> getWinners() {
        int winnerPosition = 0;

        for (Car cars : winners) {
            if (cars.getPosition() > winnerPosition) {
                winnerPosition = cars.getPosition();
            }
        }

        for (Car cars : winners) {
            if (cars.getPosition() == winnerPosition) {
                winners.add(cars);
            }

        }
        return winners;
    }
}
