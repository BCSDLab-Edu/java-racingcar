package racingcar;

import java.util.ArrayList;
import java.util.List;

class PrintWinner{
    public static void printChampion(List<Car> cars){
        int maxPosition = -1;
        List<String> champions = new ArrayList<>();

        for (Car car : cars){
            int position = car.getPosition();
            if(position > maxPosition){
                maxPosition = position;
                champions.clear();
                champions.add(car.getName());
            }
            else if (position == maxPosition){
                champions.add(car.getName());
            }
        }

        System.out.print("최종 우승자 : ");
        System.out.println(String.join(", ", champions));

    }
}
