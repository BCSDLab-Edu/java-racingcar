package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Input {

    public String[] readCarName()
    {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine().split(",");
    }

    public int readRound()
    {
        System.out.println("시도할 횟수는 몇회인가요?");
        String input = Console.readLine().trim();
        int rounds = Integer.parseInt(input);
        verificationRound(rounds);

        return rounds;
    }

    private void verificationRound(int value)
    {
        if (value <= 0)
        {
            throw new IllegalArgumentException("시도 회수는 1 이상이어야 합니다.");
        }
    }
}
