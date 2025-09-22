package racingcar;


public class Car {
    private final String name;
    private int position;

    public Car(String name)
    {
        verificationName(name);
        this.name = name;
        this.position = 0;
    }

    public void verificationName(String name)
    {
        if (name.length() > 5)
        {
            throw new IllegalArgumentException("차 이름은 5자 이하만 가능합니다.");
        }
    }

    public void move()
    {
        this.position++;
    }

    public String getName() {return name;}

    public int getPosition(int position) {return position;}
}