package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;


public class  Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        RaceManager manager = new RaceManager();
        manager.startRace();

    }

}

class Car {
    private final String name;
    private int position=0;

    public Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 최대 5자까지만 가능합니다.");
        }
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        int randomValue = Randoms.pickNumberInRange(0, 9);
        if (randomValue >= 4) {
            position++;
        }

    }
}
class RaceManager {
    public void startRace() {
        List<String> carNames = getCarnames();
        int trycount = getTryCount();

        Race race =new Race(carNames);
        race.start(trycount);

        Print.printWinner(race.getwinner());
    }

    public static List<String> getCarnames() {
        System.out.println("경주할 자동차 이름을 입력하시오.(,로 구분)");
        List<String> carNames = new ArrayList<>(List.of(Console.readLine().split(",")));
        return carNames;
    }
    private int getTryCount(){
        System.out.println("시도할 회수는 몇회인가요?");
        int trycount= Integer.parseInt(Console.readLine());
        if(trycount<=0){throw new IllegalArgumentException("시도할 회수는 1 이상이어야 합니다.");
        }
        return trycount;
    }
}



class Race{
    private final  List<Car> cars;

    public Race(List<String> carNames) {
        this.cars = new ArrayList<>();
        for (String name : carNames) {
            this.cars.add(new Car(name));
        }
    }
    public void start(int trycount) {
        System.out.println("실행 결과");
        for (int i = 0; i < trycount; i++) {

            for(Car car : cars){
                car.move();
                System.out.println(car.getName()+" : "+"-".repeat(car.getPosition()));
            }
            System.out.println();
        }


    }
    public List<Car> getwinner() {
        int maxposition = 0;
        for (Car car : cars) {
            if (car.getPosition() > maxposition) {
                maxposition = car.getPosition();
            }
        }
        List<Car> wincar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxposition) {
                wincar.add(car);
            }
        }

        return wincar;
    }
}

class Print {
    public static void printWinner(List<Car> winners) {
        List<String> names = new ArrayList<>();
        for (Car car : winners) {
            names.add(car.getName());
        }
        System.out.println("최종 우승자 : " + String.join(", ", names));
    }


}