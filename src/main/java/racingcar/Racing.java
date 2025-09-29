package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import java.util.ArrayList;


public class Racing
{
    private final List<Car> cars = new ArrayList<>();

    public Racing(String[] names)
    {
        for (String name : names)
        {
            cars.add(new Car(name.trim()));
        }
    }

    public void raceRound()
    {
        for (Car car : cars)
        {
            car.move();
        }
    }


    public List<String> getWinners()
    {
        int maxPosition = findMaxPosition();
        List<String> winners = new ArrayList<>();
        for (Car car : cars)
        {
            if (car.getPosition() == maxPosition)
            {
                winners.add(car.getName());
            }
        }
        return winners;
    }

    private int findMaxPosition()
    {
        int max = 0;
        for (Car car : cars)
        {
            if (car.getPosition() > max)
            {
                max = car.getPosition();
            }
        }
        return max;
    }

    public List<Car> getCars()
    {
        return cars;
    }
}
