package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Carracing {
    public Carracing() {
    }

    public void racing(int[] distance, int num, String[] carNames) {
        for(int i = 0; i < carNames.length; ++i) {
            distance[i] = 0;
        }

        System.out.println("\n실행 결과\n");

        for(int i = 0; i < num; ++i) {
            this.movingforward(distance);
            this.printDist(carNames, distance);
            System.out.println();
        }

    }

    private void movingforward(int[] distance) {
        for(int i = 0; i < distance.length; ++i) {
            if (Randoms.pickNumberInRange(0, 9) >= 4) {
                distance[i] += 1;
            }
        }
    }

    private void printDist(String[] carNames, int[] distance) {
        for(int i = 0; i < carNames.length; ++i) {
            System.out.print(carNames[i] + " : ");

            for(int j = 0; j < distance[i]; ++j) {
                System.out.print("-");
            }

            System.out.print("\n");
        }

    }
}