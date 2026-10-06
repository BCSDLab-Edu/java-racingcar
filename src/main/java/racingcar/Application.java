package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        List<Car> cars =CarInput.carInput();
        Manager.racing(cars);
        Manager.winnerPrint(cars);
    }
}
