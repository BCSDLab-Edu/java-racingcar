package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Racing {
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
}
