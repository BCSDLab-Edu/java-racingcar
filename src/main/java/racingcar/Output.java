package racingcar;

import java.util.List;

public class Output {
    public void printRaceStatus(List<Car> cars)
    {
        for (Car car : cars)
        {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    public void printWinner(List<String> winners)
    {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
