package racingcar.unit;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cars {
    private static ArrayList<Car> carList = new ArrayList<>();

    public Cars(ArrayList<String> name) {
        for (String n : name) {
            carList.add(new Car(n));
        }
    }

    public String getName(int idx) {
        return carList.get(idx).getName();
    }

    public String printStat(int idx) {
        return "-".repeat(carList.get(idx).getStat());
    }

    public int size() {
        return carList.size();
    }

    public void goForwardCar(int idx) {
        carList.get(idx).goForward();
    }

    public Stream<Car> stream() {
        return carList.stream();
    }

    public int max() {
        return carList.stream()
                .mapToInt(Car::getStat)
                .max()
                .getAsInt();
    }

    public String getMostMovedCarNames() {
        return carList.stream()
                .filter(car -> car.getStat() == max())
                .map(Car::getName)
                .collect(Collectors.joining(","));
    }
}
