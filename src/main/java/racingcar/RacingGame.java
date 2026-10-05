package racingcar;

import java.util.Scanner;

public class RacingGame {
    private Scanner sc = new Scanner(System.in);

    public void play() {
        System.out.print("이름을 쉼표로 구분해 입력: ");
        String line = sc.nextLine();
        String[] names = line.split(",");
        Cars cars = new Cars(names);

        System.out.print("시도할 횟수: ");
        int play = sc.nextInt();

        for (int i = 0; i < play; i++) {
            cars.moveAll();
            printRound(cars);
        }

        sc.close();

        System.out.println("최종 우승자 : " + cars.getWinners());
    }

    private void printRound(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }
}
