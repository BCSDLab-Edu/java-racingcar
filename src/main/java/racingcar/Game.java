package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Player[] players;

    Game(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String str= Console.readLine();
        String[] Names=str.split(",");
        checkNames(Names);
        players=new Player[Names.length];
        int i=0;
        for(String Name:Names) {
            players[i]=new Player(Name);
            ++i;
        }
    }
    public void play(){
        System.out.println("시도할 횟수는 몇회인가요?");
        int attempt=Integer.parseInt(Console.readLine());
        if(attempt<1){
            throw new IllegalArgumentException("횟수는 1회 이상으로 입력합니다.");
        }
        for(int i=0;i<attempt;++i){
            doAttempt();
            printStatus();
        }
        printWinners(checkWinner());
    }

    private void checkNames(String[] Names){
        if(Names==null) {
            throw new IllegalArgumentException("이름을 한 명 이상 입력하시오.");
        }
        for(String Name: Names){
            if(Name.length()>5) {
                throw new IllegalArgumentException("이름은 5글자 이하로 입력하시오.");
            }
        }
    }

    private void doAttempt() {
        for (Player player : players) player.moveForward(Randoms.pickNumberInRange(0, 9)); //모든 플레이어에 1회 전진/정지 시행
    }

    private List<Player> checkWinner(){
        List<Player> winner=new ArrayList<Player>();
        int max=0;
        for(Player player:players){
            if(player.getMovement()>max){
                max=player.getMovement();
                winner.clear();
                winner.add(player);
            }
            else if(player.getMovement()==max)  winner.add(player);
        }
        return winner;
    }

    private void printStatus(){
        for(Player player: players)
            System.out.println(player.getPlayerName()+" : "+"-".repeat(player.getMovement()));
    }

    private void printWinners(List<Player> list){
        System.out.print("최종 우승자 : ");
        for(Player winners:list){
            System.out.print(winners.getPlayerName());
        }
    }

}
