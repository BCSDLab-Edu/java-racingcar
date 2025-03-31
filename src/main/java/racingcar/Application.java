package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        ArrayList<Car> cars = new ArrayList<>();
        System.out.println("경주할 자동차 이름을 입력하세요.");
        String name = readLine();

        // 피드백: 배열 → List<String>으로 바꿈
        List<String> nameList = Arrays.asList(name.split(","));

        for (String n : nameList) { // 피드백: 배열 → List<String>으로 바꿈
            Car car = new Car(n);
            cars.add(car);
        }

        System.out.println("시도할 회수는 몇회인가요?");
        int count = Integer.parseInt(readLine());

        Racing race = new Racing();
        race.startRace(cars, count);
    }
}
