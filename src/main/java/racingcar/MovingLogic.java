package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class MovingLogic {
    private static final int MOVING_FORWARD = 4;
    // 이동 현황을 배열에 업데이트하는 메서드
    public static void updatePosition(int[] distance) {
        for (int i = 0; i < distance.length; i++) {
            distance[i] = distance[i] + goForward();
        }
    }
    // 이동 여부를 판별하는 메서드
    public static int goForward() {
        int go = 0;
        if(Randoms.pickNumberInRange(0,9)>=MOVING_FORWARD) go = 1;
        return go;
    }
}
