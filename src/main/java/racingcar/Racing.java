package racingcar;

public class Racing {
    public static void startRacing(String[] CarNamesArr, int[] distance, int tryTime) {
        for (int i = 0; i < CarNamesArr.length; i++) {
            distance[i] = 0;
        }

        System.out.println("\n실행 결과\n");

        for (int i = 0; i < tryTime; i++) {
            // 차량 이동
            MovingLogic.updatePosition(distance);
            // 경기 내용 출력 함수
            PrintCurrentRacing.printDistance(CarNamesArr, distance);
            System.out.println();
        }
    }
}
