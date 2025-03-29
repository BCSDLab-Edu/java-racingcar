package racingcar.model;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingGame {
    private final List<RacingCar> racingCars = new ArrayList<>();
    private int runCount;

    public void initializeGame(String[] carNames, int runCount) {
        this.runCount = runCount;
        for (String name : carNames) {
            racingCars.add(new RacingCar(name));
        }
    }

    public void playRound() {
        for (RacingCar car : racingCars) {
            car.move(Randoms.pickNumberInRange(0,9));
        }
    }

    public int getRunCount() {
        return runCount;
    }

    public List<RacingCar> getRacingCars() {
        return racingCars;
    }

    public List<String> findWinners() {
        int maxPosition = racingCars.stream()
                .mapToInt(RacingCar::getForwardCount)
                .max()
                .orElse(0);
        List<String> winners = new ArrayList<>();
        for (RacingCar car : racingCars) {
            if (checkWinner(car, maxPosition)) {
                winners.add(car.getCarName());
            }
        }
        return winners;
    }

    private boolean checkWinner(RacingCar car, int maxPosition){
        return car.getForwardCount() == maxPosition;
    }
}
