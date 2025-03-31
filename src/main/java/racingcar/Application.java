package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println(
                "경주할 자동차 이름을 입력하세요." +
                        "(이름은 쉼표(,) 기준으로 구분)");
        RacingGame racingGame;
        int n;
        racingGame = new RacingGame(Console.readLine());
        System.out.println("시도할 회수는 몇회인가요?");
        n = getTurn(Console.readLine());
        racingGame.runRace(n);
        racingGame.printResult();
        return;
    }
    public static int getTurn(String input) {
        int n;
        n = Integer.parseInt(input);
        if(n<1) {
            throw new RuntimeException
                    ("1보다 작은 횟수");
        }
        return n;
    }
}
