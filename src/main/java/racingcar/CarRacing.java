package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;

public class CarRacing {
    private List<Car> cars = new ArrayList<>();
    private List<String> winners = new ArrayList<>();
    private int round;

    public CarRacing() {}

    public void addCars(String str) {
        String[] names = str.split(",");
        for (var name : names) {
            cars.add(new Car(name));
        }
    }

    public void setRound(int r) {
        round = r;
    }

    public void moveCars() {
        for (Car car : cars) {
            car.move();
        }
    }

    public void referee() {
        cars.sort((Car o1, Car o2) -> o2.getLocation() - o1.getLocation());
        int max = cars.get(0).getLocation();
        for (Car car : cars) {
            if (car.getLocation() >= max) winners.add(car.getName());
            else break;
        }
    }

    public void statePrint() {
        for (Car car : cars) {
            System.out.printf("%s : %s%n", car.getName(), "-".repeat(car.getLocation()));
        }
        System.out.println();
    }

    public void resultPrint() {
        System.out.printf("최종 우승자 : %s\n", String.join(", ", winners));
    }

    public void game() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String str = Console.readLine();
        if(str == null || str.isEmpty()) throw new IllegalArgumentException();
        addCars(str);

        int r;
        System.out.println("시도할 회수는 몇회인가요?");
        while(true) {
            try {
                r = Integer.parseInt(Console.readLine());
                break;
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해 주세요.");
            }
        }

        if(r <= 0) throw new IllegalArgumentException();
        setRound(r);

        System.out.println("실행 결과");
        for (int i=0; i<round; ++i) {
            moveCars();
            statePrint();
        }
        
        referee();
        resultPrint();
    }

}
