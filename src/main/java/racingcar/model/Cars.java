package racingcar.model;

public class Cars {
    private final Car[] cars;

    public Cars(Car[] cars) {
        this.cars = cars;
    }

    public String[] getWinningCarNames() {
        int maxPosition = getMaxPosition();
        int winnerCount = countCarsAtPosition(maxPosition);
        String[] winningNames = new String[winnerCount];
        int index = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPosition() == maxPosition) {
                winningNames[index] = cars[i].getName();
                index++;
            }
        }
        return winningNames;
    }

    private int getMaxPosition() {
        int maxPosition = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPosition() > maxPosition) {
                maxPosition = cars[i].getPosition();
            }
        }
        return maxPosition;
    }

    private int countCarsAtPosition(int position) {
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPosition() == position) {
                count++;
            }
        }
        return count;
    }

    public Car[] getCars() {
        return cars;
    }

    public void moveCars() {
        for (int i = 0; i < cars.length; i++) {
            cars[i].moveCar();
        }
    }
}
