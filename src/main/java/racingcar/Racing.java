package racingcar;

import java.util.ArrayList;

public class Racing {
    public void startRace(ArrayList<Car> cars, Integer count) {
        for (int i = 0; i < count; i++) {
            for (Car c : cars) {
                c.move();
                System.out.println(c.getName() + " : " + c.getDistance());
            }
            System.out.println();
        }

        int max = 0;
        for (Car c : cars) {
            if (c.getDistanceLength() > max) {
                max = c.getDistanceLength();
            }
        }

        ArrayList<String> names = new ArrayList<>();
        for (Car c : cars) {
            if (c.getDistanceLength() == max) {
                names.add(c.getName());
            }
        }

        System.out.println("최종 우승자 : " + String.join(",", names));
    }
}
