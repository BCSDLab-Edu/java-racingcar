package racingcar;
import camp.nextstep.edu.missionutils.Randoms;
import racingcar.CreateCar;

import java.util.Random;

public class Race {
    private Random Rand = new Random();
    private CreateCar cr = new CreateCar();
    private int raceRound;
    private Car[] cars;
    private int CarNum;

    Race() {
        cars = cr.createCars();
        CarNum = cars.length;
    }


    public void initRace() {
        System.out.println("경기 횟수를 입력해주세요.");
        raceRound = Integer.parseInt(camp.nextstep.edu.missionutils.Console.readLine());
    }


    public int getRaceRound() {
        return raceRound;
    }

    public boolean move(int random) {
        //nt num = Randoms.pickNumberInRange(0,9);
        int num = Rand.nextInt(10);
        return (num >= random);
    }

    public void doRace() {
        for (int i = 0; i < CarNum; i++) {
            if (move(cars[i].getRandomFactor())) {
                cars[i].increaseWinNum();
            }
        }
        for (int i = 0; i < CarNum; i++) {
            System.out.print(String.format("%s : ", cars[i].getName()));
            System.out.println("-".repeat(cars[i].getWinNum()));
        }
    }


    public void printWinner() {
        int max = 0;
        boolean isFirst = true;
        //get max winNums
        for (int i = 0; i < CarNum; i++) {
            if (max < cars[i].getWinNum()) {
                max = cars[i].getWinNum();
            }
        }
        //print Winner
        System.out.print("최종 우승자 : ");
        for (int i = 0; i < CarNum; i++) {
            // add ',' if isn't first winner
            if (!isFirst && (max == cars[i].getWinNum())) {
                System.out.print(",");
            }
            if (max == cars[i].getWinNum()) {
                System.out.print(String.format("%s", cars[i].getName()));
                isFirst = false;
            }
        }
    }
}