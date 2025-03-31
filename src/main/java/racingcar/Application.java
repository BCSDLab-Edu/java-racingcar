package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.List;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.print("경주할 자동차들의 이름을 입력하세요.(이름은 쉽표(,) 기준으로 구분):");
        String names = readLine();
        List<Car> cars = CarName.carNaming(names);

        System.out.print("시도할 회수는 몇회인가요?");
        int tryNumber = Integer.parseInt(readLine());

        Race.race(tryNumber, cars);
        Race.result(cars);
    }
}
