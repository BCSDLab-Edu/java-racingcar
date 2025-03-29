package racingcar;
import java.lang.*;
import java.util.*;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름: ");
        String[] carNames = readLine().split(",");
        //String[] carNames = scanner.nextLine().split(",");
        List<Car> cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name.trim()));
        }

        System.out.println("시도할 횟수: ");
        int attempts = Integer.parseInt(readLine());
        //int attempts = scanner.nextInt();
        System.out.println("실행 결과:");

        for (int i = 0; i< attempts; i++) {
            for (Car car : cars){
                car.move();
            }
            printRaceStatus(cars);
        }
        printWinners(cars);
    }

    private static void printRaceStatus(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + ": " +"-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    private static void printWinners(List<Car> cars){
        int maxPosition = 0;
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
            }
        }
        for (Car car : cars) {
            if  (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
