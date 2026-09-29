package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private String name;
    private int moveDistance;
    private int totalDistance;

    public Car(String name){
        this.name = name;
        this.moveDistance=0;
        this.totalDistance=0;
    }

    public int Move(){
        int temp=Randoms.pickNumberInRange(0,9);

        if(temp>=4){
            moveDistance=temp;
        }
        else{
            moveDistance=0;
        }

        totalDistance+=moveDistance;

        return moveDistance;
    }

    public int GetTotalDistance(){
        return totalDistance;
    }
}