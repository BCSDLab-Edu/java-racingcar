package racingcar.Controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;
import racingcar.util.RandNumGenerator;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private RandNumGenerator randNumGenerater = new RandNumGenerator();
    private List<Car> cars;
    private List<Car> winnerCars;
    private int tryCount;

    public void start() {
        inputName();
        inputCount();
        for (int i=0; i<tryCount; ++i)
            startRound();
        findWinner();
        printResult();
    }

    private void inputName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)로 구분)");
        String[] names = Console.readLine().split(",");
        cars = new ArrayList<>(names.length);

        for (String name : names) {
            if (name.length() > 5) throw new IllegalArgumentException("잘못된 이름 입력");
            cars.add(new Car(name));
        }
    }

    private void inputCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        tryCount = Integer.parseInt(Console.readLine());
    }

    public void startRound() {
        for (Car car : cars) {
            tryAdvance(car, randNumGenerater.generateRandNum());
            int currCount = car.getAdvanceCount();
            System.out.print(car.getName() + " : ");
            for (int i=0; i<currCount; ++i) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void tryAdvance(Car car, int randNum) {
        if (satisfiedCondition(randNum)) car.advance();
    }

    public boolean satisfiedCondition(int randNum) {
        return randNum >= 4;
    }

    public void findWinner() {
        int maxValue = cars.stream().map(car -> car.getAdvanceCount()).max((o1, o2) -> o1-o2).orElse(0);
        winnerCars = cars.stream().filter(o1 -> o1.getAdvanceCount() == maxValue).toList();
    }

    public void printResult() {
        System.out.print("최종 우승자 : ");
        int winnerCount = winnerCars.size();
        if (winnerCount > 1) {
            for (int i=0; i<winnerCount-1; ++i) {
                System.out.print(winnerCars.get(i).getName() + ", ");
            }
        }
        System.out.println(winnerCars.get(winnerCount-1).getName());
    }
}
