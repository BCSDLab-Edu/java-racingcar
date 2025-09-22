package racingcar;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        //1. 이름 입력 받기
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분합니다.)");
        String participations = Console.readLine();

        //1-1. 이름 나누기
        String[] carNames = participations.split(","); //String을 콤마를 기준으로 나누어 리스트로 변환

        //객체 배열 생성
        Car[] cars = new Car[carNames.length];

        for (int i = 0; i < carNames.length; i++) {
            cars[i] = new Car(carNames[i]);
        }
        //공백 제거 체크용
        for (Car car : cars) { System.out.println("참가자 : " + car.getName()); }

        // 2. 시도 횟수 입력
        System.out.println("시도할 회수는 몇 회입니까?");
        String tryCounts = Console.readLine(); //readLine은 String으로 받아야 함. (int 불가x)

        int Counts = Application.validateTryCount(tryCounts);
        //System.out.println("[게임 실행 결과]");

        //3. 게임 실행
        Game game = new Game();
        for(int i = 0; i < Counts; i++){
            System.out.println("");
//            System.out.println( "["+ (i+1) +"번째 시도]");
            //각 라운드 경주 진행
            game.runRound(cars);

            //3-1. 라운드 별 결과 출력
            game.printRound(cars);
        }
        //4. 게임 끝! 결과 출력
        //4-1.
        game.checkWinner(cars);
        //4-2.
        game.printWinner(cars);
    }

    //2-1. 시도 횟수 검증(임의 규칙 생성)
    public static int validateTryCount(String tryCounts){
        // 게임 횟수는 1번 이상일 것
        int num ;
        try {
            num = Integer.parseInt(tryCounts);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }
        if (num < 1){
            throw new IllegalArgumentException("게임 횟수는 최소 1번이어야 합니다.");
        }
        // 게임 횟수는 10번 이하일 것
        if (num > 10){
            throw new IllegalArgumentException("게임 횟수는 10회 이하여야 합니다.");
        }
        return num ;
    }
}
