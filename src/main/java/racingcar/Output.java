package racingcar;
public class Output {
    public static void printRoundResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + car.getPositionSign());
        }
        System.out.println();
    }
}