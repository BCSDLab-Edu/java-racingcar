package racingcar.controller;

import racingcar.ErrorMessage;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class CarRaceController {
    private final InputView inputView;
    private final ResultView resultView;

    public CarRaceController(InputView inputView, ResultView resultView) {
        this.inputView = inputView;
        this.resultView = resultView;
    }

    public void run() {
        Cars cars = new Cars(participateCars());
        int raceCount = getRaceCount();

        runGames(cars, raceCount);
        endGame(cars.getWinningCarNames());
    }

    private Car[] participateCars() {
        String[] carNames = inputView.inputCarName();
        Car[] carList = new Car[carNames.length];
        for (int i = 0; i < carNames.length; i++) {
            carList[i] = Car.nameOf(carNames[i]);
        }
        return carList;
    }

    private int getRaceCount() {
        int raceCount = inputView.inputRaceCount();
        if (raceCount <= 0) {
            throw new IllegalArgumentException(ErrorMessage.INVAILD_RACECOUNT.getMessage());
        }
        return raceCount;
    }

    private void runGames(Cars cars, int raceCount) {
        resultView.printGameStart();
        for (int i = 0; i < raceCount; i++) {
            cars.moveCars();
            displayData(cars.getCars());
        }
    }

    private void displayData(Car[] cars) {
        resultView.printResult(cars);
    }

    private void endGame(String[] carNames) {
        resultView.printWinner(carNames);
    }
}
