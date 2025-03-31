package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarName {
    public static List<Car> carNaming(String names) {
        String[] nameList = names.split(",");
        availableNamesDetermination(nameList);
        List<Car> cars = new ArrayList<>();
        for (String name : nameList) {
            Car car = new Car(name);
            cars.add(car);
        }
        return cars;
    }

    public static void availableNamesDetermination(String[] nameList) {
        for (String name : nameList) {
            if (name.length() > 5) {
                throw new IllegalArgumentException();
            }
        }
    }
}
