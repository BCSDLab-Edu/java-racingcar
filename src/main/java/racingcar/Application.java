package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Car> cars = getCars(sc);
        int count = getTrialCount(sc);

        raceCars(cars, count);
        List<String> winners = getWinners(cars);

        printWinners(winners);
    }

    private static List<Car> getCars(Scanner sc) {
        System.out.print("차 이름들을 입력하세요 (쉼표로 구분): ");
        String[] names = Console.readLine().split(",");

        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            cars.add(new Car(name.trim()));
        }
        return cars;
    }

    private static int getTrialCount(Scanner sc) {
        System.out.print("시도할 횟수를 입력하세요: ");
        return sc.nextInt();
    }

    private static void raceCars(List<Car> cars, int count) {
        for (int i = 0; i < count; i++) {
            for (Car car : cars) {
                car.movement();
                System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
            }
        }
    }

    private static List<String> getWinners(List<Car> cars) {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }

        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        return winners;
    }

    private static void printWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}