package racingcar;
public class Car {

    private String name;
    private int position = 0; //초기화

    // 생성자
    public Car(String name) {
        this.name = validateName(name);
    }

    private String validateName(String name) { //필드는 private 권장?
        // TODO: 1. null 체크
        if (name == null) throw new IllegalArgumentException("이름을 입력해주세요.");

        // TODO: 2. 이름이 비었는지 체크(공백만으로 이루어졌는지)
        String s = name.strip();
        if (s.isEmpty()) throw new IllegalArgumentException("이름은 공백만으로 이루어질 수 없습니다.");

        // TODO: 길이 > 5 체크
        if (s.length() > 5) throw new IllegalArgumentException("이름은 5글자 이하여야 합니다");
        return s;
    }

    public String getName() { return name; }
    public int getPosition() { return position; }

    public StringBuilder printPosition() { //String으로는 문자열 추가가 어려움. buffer또는 builder를 사용해야함.
        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(Math.max(0, position))); //for문 대신 string.repeat로 변경
        return sb;
    }
//    public String printPosition() { //String으로는 문자열 추가가 어려움. buffer또는 builder를 사용해야함.
//        return "-".repeat(position);
//    }

    //4 이상이면 전진
    void moveIf(int num) { if (num >= 4) { position++; } }
}