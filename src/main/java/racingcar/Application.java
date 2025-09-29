package racingcar;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Scanner sc = new Scanner(System.in);
        //1.자동차 이름 입력하기
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉽표(,) 기준으로 구분합니다.)");
        String input = sc.nextLine();
        String[] carNames = input.split(",");

        List<Car> cars = new Arraylist<>()
;
        //2.시도 횟수
        System.out.println("시도할 횟수는 몇회인가요?");
        int attempts = sc.nextInt();
        if (attempts <= 0) {

        }
        //3.경주 실행
        System.out.println("실행 결과");
        for (int i = 0; i < attempts; ++) {
            for
        }
        //4.우승자
        System.out.println("최종 우승자 :");
        }


}
