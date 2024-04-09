package racingcar;
import racingcar.CreateCar;
public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Race race = new Race();
        race.initRace();

        System.out.println("실행 결과");
        for (int i = 0; i < race.getRaceRound(); i++) {
            race.doRace();
        }
        race.printWinner();
    }
}
