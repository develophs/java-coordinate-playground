package coordinate.v1.util;

import coordinate.v1.util.ValidateUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateUtilsTest {

    @Test
    void 구분된_입력값이_검증되면_True를_반환한다() {
        //given
        List<String> inputs = Arrays.asList("(10,10)", "(14,15)");

        //when
        boolean isPass = ValidateUtils.validateAll(inputs);

        //then
        assertThat(isPass).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"(10,10)-", "(10,10", "10,10)", "(1010)", "(10,)", "(,10)"})
    void 구분된_입력값이_검증에_실패하면_False를_반환한다(String input) {
        //given
        //when
        boolean isPass = ValidateUtils.validate(input);

        //then
        assertThat(isPass).isFalse();
    }

}
