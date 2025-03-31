package racingcar;

public class PrintCurrentRacing {
    // 이동 현황을 출력하는 메서드
    public static void printDistance(String[] CarNamesArr, int[] distance) {
        for (int i = 0; i < CarNamesArr.length; i++) {
            System.out.print(CarNamesArr[i] + " : ");
            printDash(distance, i);
            System.out.println();
        }
    }
    // 이동 거리를 '-'문자로 출력하는 메소드
    public static void printDash(int[] distance, int i) {
        for (int j = 0; j < distance[i]; j++) {
            System.out.print("-");
        }
    }
}
