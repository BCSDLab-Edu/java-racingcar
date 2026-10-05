package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Cars {
    private Car[] cars;

    public Cars(String[] names) {
        cars = new Car[names.length];
        for (int i = 0; i < names.length; i++) {
            cars[i] = new Car(names[i]);
        }
    }

    public void moveAll() {
        for (int i = 0; i < cars.length; i++) {
            int num = Randoms.pickNumberInRange(0, 9);
            cars[i].move(num);
        }
    }

    public Car[] getCars() {
        return cars;
    }

    public String getWinners() {
        int max = -1;
        String winners = "";
        for (int i = 0; i < cars.length; i++) {
            int position = cars[i].getPosition();
            if (position > max) {
                max = position;
                winners = cars[i].getName();
            } else if (position == max) {
                winners += ", " + cars[i].getName();
            }
        }
        return winners;
    }
}
