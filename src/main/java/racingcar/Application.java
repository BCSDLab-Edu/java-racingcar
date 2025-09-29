package racingcar;

public class Application {
    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();

        String[] carNames = input.readCarName();
        int rounds = input.readRound();

        Racing racing = new Racing(carNames);

        for (int i = 0; i < rounds; i++)
        {
            racing.raceRound();
            output.printRaceStatus(racing.getCars());
        }

        output.printWinner(racing.getWinners());
    }
}
