package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class CarInput {
    public static List<Car> carInput(){
        List<Car> cars = new ArrayList<>();
        String temp= Console.readLine();
        String[] carNames=temp.split(",");

        for (String car : carNames){
            if(car.length()>5){
                throw new IllegalArgumentException();
            }

            cars.add(new RacingCar(car));
        }

        return cars;
    }
}
