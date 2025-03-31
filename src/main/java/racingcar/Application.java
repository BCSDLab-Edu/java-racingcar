package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;


public class Application {
    public Application() {
    }


    public static void main(String[] args) {
        Carinformation carInfo = new Carinformation();
        Numberofattempts numberOfAttempts = new Numberofattempts();
        Carracing carRacing = new Carracing();
        Winner winner = new Winner();
        String[] carNames = carInfo.getCarNames();
        int attempts = numberOfAttempts.getnumberofattempts();
        int[] distance = new int[carNames.length];
        carRacing.racing(distance, attempts, carNames);
        winner.printWinner(carNames, distance);
    }
}