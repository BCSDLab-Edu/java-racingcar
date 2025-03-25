package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static org.assertj.core.api.Assertions.assertThat;


public class Application {

    @Test
    void test() {
        String input = "1,2,3,45";
        String[] result = input.split(",");

        assertThat(result).contains("45","3","2", "1");
        assertThat(result).containsExactly("1","2","3", "45");
    }

    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String userInput = readLine().trim();
        List<String> carNames = new ArrayList<>();

        for (String name : userInput.split(",")) {
            carNames.add(name.trim());
        }

        //예외처리---------------------------------------------------
        try {
            for (String Name : carNames) {
                if (Name.length() > 5) {
                    throw new IllegalArgumentException();
                }
            }
        } catch (IllegalArgumentException e) {
            return;
        }

        System.out.println("시도할 회수는 몇회인가요?");
        String count1 = readLine();
        int count = Integer.parseInt(count1);

        System.out.println("실행 결과");

        //경주준비-------------------------------------------------
        List<Integer> score = new ArrayList<>();
        String line;

        for (String Name1 : carNames) {
            score.add(0);
        }

        //경주시작-------------------------------------------------
        int ssc = 0;
        for (int i = 0; i < count * carNames.size(); i++) {

            if (ssc == carNames.size()) {
                ssc = 0;
            }

            //랜덤계산-------------------------------------------------
            int randomInt = Randoms.pickNumberInRange(0, 9);
            if (randomInt > 3) {
                score.set(ssc, score.get(ssc) + 1);
            }
            ssc = ssc + 1;
        }

        //1등 찾기--------------------------------------------------------------
        int rank1 = 1;
        int rank2 = 0;
        for (int k = 0; score.size() - 1 > k; k++) {
            rank2 = Math.max(score.get(k), score.get(k + 1));
            if (rank2>rank1){
                rank1=rank2;
            }
        }

        if (carNames.size()==1){
            rank1=score.get(0);
        }

        //출력-------------------------------------------------
        for (int k = 0; score.size() > k; k++) {
            line = "-".repeat(score.get(k));
            System.out.println(carNames.get(k) + " : " + line);
        }
        System.out.println("");

        // 1등 출력---------------------------------------------------
        List<String> winner = new ArrayList<>();
        for (int k = 0; score.size()> k; k++) {
            if (rank1== score.get(k)){
                winner.add(carNames.get(k));
            }
        }
        System.out.print("최종 우승자 : " + String.join(" ,", winner));

    }
}

