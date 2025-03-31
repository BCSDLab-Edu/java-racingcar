package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    String name;
    int distance;

    public Car(String name) throws CarNameInputException{
        name=name.trim();
        if(name.length()>5||name.length()<1) {
            System.out.println("자동차 이름은 1글자 이상, 5글자 이하여야 합니다.");
            throw new CarNameInputException("잘못된 값이 입력되어서 종료합니다.");
        }
        /*if(name.indexOf(":")==-1){
            throw new CarNameInputException("':'는 포함하면 안됩니다.");
        }*/
        this.name=name;
        this.distance=0;
    }
    public void run() {
        if(Randoms.pickNumberInRange(0,9)>=4){
            this.distance++;
        }
    }
    public void print() {
        System.out.print(this.name+" : ");
        for(int i=0;i<distance;i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
