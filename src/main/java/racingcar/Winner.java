package racingcar;

public class Winner {
    public Winner() {
    }

    public void printWinner(String[] carNames, int[] distance) {
        int max = this.maxdis(distance);
        System.out.print("최종 우승자 : ");

        boolean firstWinner = true; // 첫 번째 우승자 확인

        for (int i = 0; i < distance.length; ++i) {
            if (distance[i] == max) {
                if (!firstWinner) {
                    System.out.print(", ");
                }
                System.out.print(carNames[i]);
                firstWinner = false; // 첫 번째 우승자 출력 후 false로 설정
            }
        }
    }


    private int maxdis(int[] distance) {
        int max = 0;

        for(int i = 0; i < distance.length; ++i) {
            if (distance[i] > max) {
                max = distance[i];
            }
        }

        return max;
    }
}