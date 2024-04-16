package racingcar;
import java.util.*;
class StartRacing{
    public static void goOrStay(List<Car> cars) {
        MakeRandomChance ran = new MakeRandomChance();

        for (Car car : cars) {
            if (ran.randomNum() == 1) {
                car.setPosition(car.getPosition() + 1);
            }
        }
    }
}
