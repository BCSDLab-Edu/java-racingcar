package racingcar;
public class Validator {
    public static void validateCarName(String name) {
        if (name == null || name.trim().isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 1~5자 이내여야 합니다.");
        }
    }
    public static int validateTryCount(String input) {
        try {
            int count = Integer.parseInt(input);
            if (count < 0) {
                throw new IllegalArgumentException("시도 횟수는 0 이상이어야 합니다.");
            }
            return count;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }
    }
}