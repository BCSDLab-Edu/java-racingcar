package racingcar;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;

public class Manager {

    public static void carInput(){
        List<Car> cars = new ArrayList<>();
        String temp=Console.readLine();
        String[] carNames=temp.split(",");

        for (String car : carNames){
            if(car.length()>5){
                throw new IllegalArgumentException();
            }

            cars.add(new Car(car));
        }
    }
}