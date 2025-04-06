package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        // TODO: 프로그램 구현

        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split(",");

        List<Car> cars = new ArrayList<>();

        for (String name : names)
        {
            cars.add(new Car(name));
        }

        int count=sc.nextInt();

        for (int i = 0; i < count; i++) {
            for (Car car : cars) {
                car.movement();
                System.out.println(car.getName()+ " : " + "-".repeat(car.getPosition()));
            }
        }

        int win=0;

        for(Car car:cars)
        {
            if(car.getPosition()>win) {
                win = car.getPosition();
            }
        }
        List<String> winCars = new ArrayList<>();

        for(Car car: cars)
        {
            if(car.getPosition() == win)
            {
                winCars.add(car.getName());
            }
        }
        System.out.print("winner"+String.join(", ",winCars));

    }
}
