package racingcar.view;

import racingcar.model.Car;

public class ResultView {
    public void printResult(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    public void printWinner(String[] carNames) {
        System.out.println("최종 우승자 : " + joinByComma(carNames));
    }

    public void printGameStart() {
        System.out.println("실행 결과");
    }

    private String joinByComma(String[] values) {
        if (values.length == 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        builder.append(values[0]);
        for (int i = 1; i < values.length; i++) {
            builder.append(", ");
            builder.append(values[i]);
        }
        return builder.toString();
    }
}
