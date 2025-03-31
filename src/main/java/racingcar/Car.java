package racingcar;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Car {
    private String name;
    private int position = 0;

    public Car(String name){
        if (name.length() > 5) {
            throw new IllegalArgumentException("오류: 문자열은 최대 5글자까지만 입력할 수 있습니다.");
        }
        this.name = name;
    }

    public Car(int position){
        this.position = position;
    }

    public void move(){
        if (pickNumberInRange(0, 9) >= 4) {
           position += 1;
        }
    }

    public String getPositionToString(){
        return "-".repeat(position);
    }

    public String getName(){
        return name;
    }

    public int getPosition() {
        return position;
    }
}
