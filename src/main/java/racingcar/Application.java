package racingcar;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;
import game.RacingGame;

import java.util.ArrayList;
import java.util.List;


public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현;
        RacingGame game =new RacingGame();

        try {
            game.run();
        }
        finally {
            game.close();
        }
    }
}
//수정
