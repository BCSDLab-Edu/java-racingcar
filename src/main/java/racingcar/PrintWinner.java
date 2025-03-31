package racingcar;

public class PrintWinner {
    // 우승자 출력 메서드
    public static void printWinner(String[] CarNamesArr, int[] distance) {
        boolean isPrinted = false;
        int max = maxDistance(distance);
        System.out.print("최종 우승자 : ");
        for (int i = 0; i < distance.length; i++) {
            if(isPrinted && distance[i]==max) System.out.print(", ");
            if(distance[i]==max) {
                System.out.print(CarNamesArr[i]);
                isPrinted = true;
            }
        }
    }

    // 이동한 최대 거리 반환 메소드
    public static int maxDistance(int[] distance) {
        int max = 0;
        for (int i = 0; i < distance.length; i++) {
            if(distance[i] > max) max = distance[i];
        }
        return max;
    }
}
