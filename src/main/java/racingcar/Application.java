package racingcar;

import racingcar.controller.GameController;
import racingcar.model.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        GameController game = new GameController(racingGame, inputView, outputView);
        game.startGame();
    }

}

