package racingcar;
import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private static final int MOVE_THRESHOLD = 4; // 피드백: 4를 의미있는 상수로
    protected String name;
    private String distance;

    public Car(String Name) {
        if (Name == null || Name.length() > 5)
            throw new IllegalArgumentException();
        this.name = Name;
        this.distance = "";
    }

    public void move() { // 피드백: 접근제어자 명시 (default → public)
        int num = Randoms.pickNumberInRange(0, 9);
        if (num >= MOVE_THRESHOLD) {
            this.distance += "-";
        }
    }

    public String getName() {
        return name;
    }

    public String getDistance() {
        return distance;
    }

    public int getDistanceLength() {
        return distance.length();
    }

}
