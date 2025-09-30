// 상태 : 자동차의 이름, 위치
// 행동 : 움직인다/움직이지 않는다

package racingcar;
public class Car {

    private final String name; // final로 변경
    private int position = 0; // 초기화

    // 생성자
    public Car(String name) {
        this.name = validateName(name);
    }

    private String validateName(String name) {
        // 1. null 체크
        if (name == null) throw new IllegalArgumentException("이름을 입력해주세요.");

        // 2. 이름이 비었는지 체크(공백만으로 이루어졌는지)
        String s = name.strip();
        if (s.isEmpty()) throw new IllegalArgumentException("이름은 공백만으로 이루어질 수 없습니다.");

        // 3. 길이 > 5 체크
        if (s.length() > 5) throw new IllegalArgumentException("이름은 5글자 이하여야 합니다");
        return s;
    }

    public String getName() { return name; }
    public int getPosition() { return position; }



    //4 이상이면 전진
    void moveIf(int num) { if (num >= 4) { position++; } }
}
