package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Game { //게임 진행 클래스
    //3-1. 랜덤 넘버 생성
    public int pickRandomNumber(){
        return Randoms.pickNumberInRange(0,9);
    }

    //3-2. 라운드 진행
    public void runRound(Car[] cars){
        //모든 차에 대해 랜덤 수를 뽑고, 전진 여부를 판단하기
        for (Car car : cars) {
            int n = pickRandomNumber();
            car.moveIf(n);
        }
    }

    //3-3. 라운드 결과 출력(라운드마다 실행!)
    public void printRound(Car[] cars){
        for (Car car : cars) {
            // 단순히 getPosition으로 숫자만 출력하는게 아님! 현재 위치를 '-' 이용해서 출력하기
            System.out.println(car.getName() + " : " + car.printPosition());
        }
    }
    //4. 게임 끝!

    //4-1. 마지막 위치 확인
    // - 객체 배열 순회하면서 최종 위치 + 우승자 갱신
    public StringBuilder checkWinner(Car[] cars){
        StringBuilder winners = new StringBuilder(); //winner는 2명 이상일 수 있으므로 stringbuilder로 생성
        int maxPosition = 0;
        //<1> 1번 순회하기 (max값과 같으면 string에 추가, 더 크면 초기화)
        for (Car car : cars) {
            //[1] max보다 크면 StringBuilder 초기화 후 우승자 후보 정보 입력
            if (car.getPosition() > maxPosition) {
                //StringBuilder 초기화
                winners.delete(0, winners.length());
                winners.append(car.getName());
                maxPosition = car.getPosition();
            }
            //[2] max와 동일하면 초기화는 하지 않고 우승자 후보 추가 입력
            else if (car.getPosition() == maxPosition) {
                if (winners.length() > 0) { winners.append(", ");}
                winners.append(car.getName());
            }
        }
//        //<2> 2번 순회하기 (maxPosition 찾고, max와 동일한 position을 가진 carName 수집)
//        for (Car car : cars) {
//            if (car.getPosition() >= maxPosition) { maxPosition = car.getPosition(); }
//        }
//        for (Car car : cars) {
//            if (car.getPosition() == maxPosition) { winners.append(car.getName()).append(", "); }
//        }
        return winners;
    }
    public void printWinner(Car[] cars){
//        System.out.println("<최종 우승자> :"+ checkWinner(cars));
          System.out.println("최종 우승자 : " + checkWinner(cars));

    }
}

