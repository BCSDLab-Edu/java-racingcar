package racingcar;
import camp.nextstep.edu.missionutils.Console;
import java.util.*;

public class Application{
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        String inputName = Console.readLine();
        String [] carNames = inputName.split(",");
        Car.isNameCorrect();

        System.out.println("시도할 회수를 입력하세요");
        String inputStr = Console.readLine();
        int inputCount = Integer.parseInt(inputStr);


        List<Car> cars = new ArrayList<>();

        for (String carName : carNames){
            cars.add(new Car(carName));
        }

        for(int i=0; i<inputCount; i++) {
            StartRacing.goOrStay(cars);
        }

        PrintRacing.printCarPosition(cars);
        PrintWinner.printChampion(cars);
    }
}




