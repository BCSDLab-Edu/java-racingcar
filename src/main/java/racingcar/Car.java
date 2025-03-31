package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private String name;
    private int location;

    public Car(String str) {
        if(str == null || str.isEmpty()) throw new IllegalArgumentException();
        if(str.length() > 5) throw new IllegalArgumentException();
        name = str;
        location = 0;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public void move() {
        int r = Randoms.pickNumberInRange(0,9);
        if (r >= 4) ++location;
    }
}
