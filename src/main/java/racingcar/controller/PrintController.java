package racingcar.controller;

import racingcar.unit.Cars;

public class PrintController {
    public void printInterimResult(int round, Cars carList) {
        System.out.print(round + " 라운드\n");
        printResult(carList);
        System.out.println();
    }

    public void printResult(Cars carList) {
        carList.stream()
                .forEach(car ->
                System.out.println(car.getName() + " : " + "-".repeat(car.getStat()))
        );
    }

    public void printWinnerNames(String names) {
        System.out.print("최종 우승자 : ");
        System.out.println(names);
    }
}
