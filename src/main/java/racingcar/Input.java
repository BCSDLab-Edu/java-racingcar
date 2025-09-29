package racingcar;
import camp.nextstep.edu.missionutils.Console;
import java.util.*;
public class Input{
    public static List<Car> readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        String[] names = input.split(",");
        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            Validator.validateCarName(name.trim());
            cars.add(new Car(name.trim()));
        }
        return cars;
    }
    public static int readTryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        String input = Console.readLine();
        return Validator.validateTryCount(input);
    }
}