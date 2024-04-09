package racingcar;
import camp.nextstep.edu.missionutils.Console;
import java.util.Scanner;

import racingcar.Car;

public class CreateCar {
    private void iligalArgumentHandler(String name){
        if ((name.length() == 0) || (name.length() > 5)) {
            throw new IllegalArgumentException();
        }
    }

    public Car[] createCars() {
        int carNum;
        Car[] cars;
        //input Cars name
        System.out.println("경주할 자동차의 이름을 쉼표(,)로 구분하여 입력하시오.");
        String carsNameInput;
        carsNameInput = camp.nextstep.edu.missionutils.Console.readLine();
        //splits Cars name
        String[] carsNameInputSplits = carsNameInput.split(",");
        carNum = carsNameInputSplits.length;
        //check iligal Argument
        for (int i = 0; i < carNum; i++) {
            iligalArgumentHandler(carsNameInputSplits[i]);
        }
        //Create Car odject
        cars = new Car[carNum];
        for (int i = 0; i < carNum; i++) {
            cars[i] = new Car(carsNameInputSplits[i]);
        }

        return cars;
    }
}