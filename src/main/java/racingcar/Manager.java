package racingcar;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;

public class Manager {

    public static void racing(List<Car> cars){
        String temp = Console.readLine();
        int count = Integer.parseInt(temp);
        for(int i=0;i<count;i++){
            for(Car car : cars){
                car.move();
                System.out.println(car.getName()+" : "+car.getDistance());
            }
            System.out.print("\n");
        }
    }

    public static void winnerPrint(List<Car> cars){
        int winnerLength = 0;
        int currentLength = 0;
        List<String> winners = new ArrayList<>();
        for(Car car : cars){
            currentLength = car.getDistance().length();
            if(currentLength>winnerLength){
                winners.clear();
                winners.add(car.getName());
                winnerLength=currentLength;
            }
            else if(currentLength==winnerLength) {
                winners.add(car.getName());
            }
        }
        System.out.println("최종 우승자 : "+String.join(", ",winners));
    }
}