package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private String score;

    public Car(String name) {
        this.name = name;
        this.score = "";
    }

    public void move() {
        int n = Randoms.pickNumberInRange(0, 9);
        if (n >= 4) {
            score += "-";
        }
    }

    public String getScore(){
        return score;
    }

    public String getName() {
        return name;
    }

}
