package racingcar;

import java.util.ArrayList;
import java.util.List;
import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        String[] names = readLine().split(",");
        List<Car> cars = new ArrayList<>();

        for (String name: names) {
            cars.add(new Car(name));
        }

        System.out.println("시도할 횟수는 몇 회인가요?");
        int count = Integer.parseInt(readLine());

        System.out.println("실행 결과");
        for (int i = 0; i < count; i++) {
            for (Car car: cars){
                car.move();
                System.out.println(car.getName() + " : " + car.getPositionToString());
            }
            System.out.println();
        }

        GameResult gameResult = new GameResult();
        gameResult.getWinners();
        System.out.print("최종 우승자 : " + String.join(", ") + gameResult.getWinners());
    }
}
