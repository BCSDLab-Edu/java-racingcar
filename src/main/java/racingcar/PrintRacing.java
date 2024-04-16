package racingcar;
import java.util.*;
class PrintRacing{
    public static void printCarPosition(List<Car> cars){
        for(Car car : cars) {
            System.out.print(car.getName() + ": ");
            for(int j =0; j<car.getPosition(); j++){
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }
}
