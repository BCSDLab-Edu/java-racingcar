package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Numberofattempts {
    public Numberofattempts() {
    }

    public int getnumberofattempts() {
        System.out.print("시도할 회수는 몇 회인가요? ");
        String attempts = Console.readLine();
        this.checknumber(attempts);
        return Integer.parseInt(attempts);
    }

    private void checknumber(String attempts) {
        if (!Character.isDigit(attempts.charAt(0))) {
            throw new IllegalArgumentException("올바른 수를 입력하세요.");
        }
    }
}