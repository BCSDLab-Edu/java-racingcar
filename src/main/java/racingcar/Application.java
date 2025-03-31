package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Application {

    public static String[] divideRawCarName(String rawCarNames) {
        String[] carNames = rawCarNames.split(",");
        return carNames;
    }

    public static void main(String[] args) {
        Game game = new Game();

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String rawCarNames = Console.readLine();
        String[] carNames = divideRawCarName(rawCarNames);
        for (String carName : carNames) {
            game.addPlayer(carName);
        }

        System.out.println("시도할 횟수는 몇회인가요?");
        String attemptCount = Console.readLine();
        game.setCount(attemptCount);

        game.run();

        String winners = game.checkWinner();
        System.out.println("최종 우승자 : " + winners.substring(0, winners.length()-2));
    }
}
