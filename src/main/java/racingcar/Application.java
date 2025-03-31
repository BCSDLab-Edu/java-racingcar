package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Application { // 퍼블릭 키워드가 붙은 클래스는 파일명과 동일한 클래스명으로 작성
    public static void main(String[] args) {
        System.out.println("경주 할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] CarNamesArr = inputCarNames(Console.readLine()); // 자동차 이름 입력 메서드
        InvalidInputFilter.isCorrectNames(CarNamesArr); // 표준 예외 처리
        int[] distance = new int[CarNamesArr.length]; // 입력한 자동차 이름 개수만큼 이동 거리 정보를 담을 배열 생성

        System.out.println("시도할 횟수는 몇 회인가요?");
        String tryTimeStr = Console.readLine(); // 시도 횟수 입력
        InvalidInputFilter.isCorrectNumber(tryTimeStr); // 표준 예외 처리
        int tryTime = Integer.parseInt(tryTimeStr); // 시도 횟수를 int 형으로 변환하여 저장

        Racing.startRacing(CarNamesArr, distance, tryTime); // 경주 시작 메서드
        PrintWinner.printWinner(CarNamesArr, distance); // 경기 결과 출력 메서드
    }

    public static String[] inputCarNames(String CarNames) {
        return CarNames.split(",");
    }
}