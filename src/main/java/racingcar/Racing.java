package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import java.util.ArrayList;


public class Racing
{
    private final List<Car> cars = new ArrayList<>();
    private int rounds;

    public void start()
    {
        inputCars();
        inputRounds();
        play();
    }

    private void inputCars()
    {
        String[] names = Console.readLine().split(",");
        for (String name : names)
        {
            cars.add(new Car(name.trim()));
        }
    }

    private void inputRounds()
    {
        System.out.println("시도할 횟수는 몇회인가요?");
        rounds = Integer.parseInt(Console.readLine().trim());
        verificationRound(rounds);
    }

    private void verificationRound(int value)
    {
        if (value <= 0)
        {
            throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
        }
    }

    private  void play()
    {
        for (int i = 0; i < rounds; i++)
        {
            raceRound();
            printRaceStatus();
        }
    }

    private void raceRound()
    {
        for (Car car : cars)
        {
            car.move();
        }
    }

    private void printRaceStatus()
    {
        for (Car car : cars)
        {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }
}