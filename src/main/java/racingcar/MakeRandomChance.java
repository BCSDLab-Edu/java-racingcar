package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

class MakeRandomChance{
    public int randomNum(){
        int number = Randoms.pickNumberInRange(0,9);
        if(number >= 4) {
            return 1;
        }
        else{
            return 0;
        }
    }
}
