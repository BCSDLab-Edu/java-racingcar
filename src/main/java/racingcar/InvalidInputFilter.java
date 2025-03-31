package racingcar;

public class InvalidInputFilter {
    private static final int MAX_INT = 5;
    private static final int MIN_INT = 1;
    public static void isCorrectNames(String[] CarNamesArr) {
        for (int i = 0; i < CarNamesArr.length; i++) {
            if(CarNamesArr[i].length() > MAX_INT || CarNamesArr[i].length() < MIN_INT) {
                throw new IllegalArgumentException("각 자동차 이름의 길이는 1~5 범위 내로 입력하세요.");
            }
        }
    }

    public static void isCorrectNumber(String tryTimeStr) {
        for(int i = 0; i < tryTimeStr.length(); i++) {
            if(!Character.isDigit(tryTimeStr.charAt(i))) {
                throw new IllegalArgumentException("올바른 수를 입력하세요.");
            }
        }
    }
}