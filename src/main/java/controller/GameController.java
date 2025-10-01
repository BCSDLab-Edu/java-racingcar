package controller;

import service.CarService;

import view.GameView;

public class GameController {



    private final GameView gameView;
    private final CarService carService;

    public GameController() {
        gameView = new GameView();
        carService = new CarService();
    }

    /*public static GameController getInstance() {
        if(gameController == null) {
            gameController = new GameController();
        }
        return gameController;
    }*/

    public void raceSet(String[] names) {
        gameView.printResult();
        carService.fill(names);
    }

    public void race(int count) {
        String result = carService.getResult(count);
        gameView.printResult(result);
    }

    public void raceResult() {
        String winners = carService.getWinners();
        gameView.printWinners(winners);
    }

    public void close() {
        carService.close();
        gameView.close();
        //gameController = null;
    }

}
