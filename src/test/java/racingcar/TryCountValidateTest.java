package racingcar;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import org.junit.jupiter.api.Test;

public class TryCountValidateTest {
    //2번 - 시도할 횟수 입력 테스트
    @Test
    void 게임횟수가_0이하면_예외처리(){
        assertThatThrownBy(() -> Application.validateTryCount("0"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 게임횟수가_10초과면_예외처리(){
        assertThatThrownBy(() -> Application.validateTryCount("11"))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
