package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar implements Car{
    private String name;
    private String distance;

    public RacingCar(String name){
        this.name = name;
        this.distance ="";
    }

    public void move(){
        int temp=Randoms.pickNumberInRange(0,9);

        if(temp>=4){
            distance +="-";
        }
    }

    public String getName(){
        return name;
    }

    public String getDistance(){
        return distance;
    }
}