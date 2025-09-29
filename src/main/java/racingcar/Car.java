package racingcar;
import camp.nextstep.edu.missionutils.Randoms;
public class Car {
    private final String name;
    private int position=0;
    public Car(String name){this.name = name;}
    private void raceOnce() {
        for (Car car : cars) {
            int number = Randoms.pickNumberInRange(0, 9);
            car.move(number);
        }
    }
    public void move(int number){if(number>=4){position++;}}
    public String getName(){return name;}
    public int getPosition(){return position;}
    public String getPositionSign(){return "-".repeat(position);}
}