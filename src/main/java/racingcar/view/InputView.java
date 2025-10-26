package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String[] inputCarName() {
        System.out.println("차의 이름을 입력해주세요(구분은 ,로)");
        String[] rawNames = Console.readLine().split(",");
        String[] names = new String[rawNames.length];
        for (int i = 0; i < rawNames.length; i++) {
            names[i] = rawNames[i].trim();
        }
        return names;
    }

    public int inputRaceCount() {
        System.out.println("경주 횟수를 입력해주세요.");
        return Integer.parseInt(Console.readLine());
    }
}
