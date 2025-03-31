package racingcar;

import java.util.List;
import java.util.ArrayList;

public class Race {
    public static void race(int tryNumber, List<Car> cars) {
        for (int i = 0; i < tryNumber; i++) {
            for (Car car : cars) {
                car.move();
                System.out.println(car.getName() + " : " + car.getScore());
            }
            System.out.println("\n");
        }
    }

    public static void result(List<Car> cars) {
        List<String> winners = new ArrayList<>();
        int maxScore = 0;
        for (Car car : cars) {   //maxScore설정
            if (car.getScore().length() > maxScore) {
                maxScore = car.getScore().length();
            }
        }
        for (Car car : cars) {    //maxScore인 차량들 저장
            if (car.getScore().length() == maxScore) {
                winners.add(car.getName());
            }
        }
        System.out.println("최종 우승자 : " + String.join(",", winners));
    }
}
