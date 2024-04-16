package racingcar;

class Car {
    private  int position;
    private static String name;
    public Car(String name){
        this.position = 0;
        this.name = name;
    }
    public static void isNameCorrect() {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 한다.");
        }
    }

    public void setPosition(int position){
        this.position = position;
    }

    public int getPosition(){
        return position;
    }

    public String getName(){
        return name;
    }

}
