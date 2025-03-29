### 주의 사항
* 자바 라이브러리가 아닌 camp 라이브러리를 통해 인풋을 받을 것

### 목표
* 테스트를 모두 통과 시킨다.

### 클래스 소개
* Game 
* RacingCar

#### Game 클래스
* 사용자로부터 인풋을 받는다(자동차 이름)
  * inputCarName
* 사용자로부터 실행 횟수를 입력받는다.
  * 잘못된 입력, 마이너스, int범위 초과 등의 입력이 들어왔을 때 예외를 일으킨다.
  * inputRunCount 
* 자동차 이름을 설정해준다.
  * 이름을 쉼표로 나누어 구분한다. 중복된 이름, 잘못된 형식의 이름은 예외를 일으킨다. 앞 뒤 공백 제거를 위해 trim을 사용한다.
  * splitCarName, setCarName, setCar
* 랜덤숫자를 뽑는다 & 랜덤숫자가 4이상이면 전진한다.
  * randomPick, carCanGo 
* 우승자를 찾는다.
  * pickWinner, pickWinnerCalc
* 게임 상황 및 우승자를 출력한다.
  * printWinner, gameStatePrint, gameResultPrint
* 레이싱 게임 설정
  * gameSetting

#### RacinCar 클래스
* carName, forwardCount를 멤버변수로 가진다.
* 사용자로부터 입력받는 자동차 이름이 5보다 길면 예외를 일으킨다.