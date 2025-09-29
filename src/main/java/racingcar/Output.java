package racingcar;
import java.util.*;
public class Output {
    public static void printRoundResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + car.getPositionSign());
        }
        System.out.println();
    }
    public static void printWinners(List<Car> winners) {
        String result = String.join(", ",
                winners.stream().map(Car::getName).toList());
        System.out.println("최종 우승자 : " + result);
    }
}