package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar implements Car{
    private String name;
    private String distance;

    public RacingCar(String name){
        this.name = name;
        this.distance ="";
    }

    @Override
    public void move(){
        int temp=Randoms.pickNumberInRange(0,9);

        if(temp>=4){
            distance +="-";
        }
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getDistance(){
        return distance;
    }
}