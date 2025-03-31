package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    String name;
    int point;

    public Car(String name) {
        if (name.length() > 5){
            throw new IllegalArgumentException();
        } else {
            this.name = name;
            this.point = 0;
        }
    }

    public void run() {
        int num = Randoms.pickNumberInRange(0, 9);
        if (num < 5) { this.point++; }
    }

    public void printCurrentPoint() {
        System.out.println(this.name + " : " + "-".repeat(this.point));
    }
}
