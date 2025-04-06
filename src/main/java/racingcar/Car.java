package racingcar;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Car
{
    private String name;
    int position = 0;

    public Car(String name)
    {
        if (name.length() > 5)
        {
            throw new IllegalArgumentException("5자 이하만");

        }
        this.name=name;
    }

    public void movement()
    {
        if (pickNumberInRange(0, 9) >= 4)
        {
            position++;
        }
    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }
}
