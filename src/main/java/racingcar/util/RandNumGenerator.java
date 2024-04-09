package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandNumGenerator {
    public int generateRandNum() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
