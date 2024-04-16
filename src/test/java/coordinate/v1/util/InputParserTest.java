package coordinate.v1.util;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InputParserTest {

    @Test
    void 파싱객체는_구분자를_기준으로_입력값을_구분_할_수_있다() {
        //given
        InputParser parser = new InputParser("(10,10)-(14,15)");

        //when
        List<String> inputs = parser.parse("-");

        //then
        assertThat(inputs).hasSize(2)
                .contains("(10,10)", "(14,15)");
    }
    
}
