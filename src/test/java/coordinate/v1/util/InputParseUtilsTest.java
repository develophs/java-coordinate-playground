package coordinate.v1.util;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InputParseUtilsTest {

    @Test
    void 파싱객체는_구분자를_기준으로_입력값을_구분_할_수_있다() {
        //given
        //when
        List<String> inputs = InputParseUtils.split("(10,10)-(14,15)", "-");

        //then
        assertThat(inputs).hasSize(2)
                .contains("(10,10)", "(14,15)");
    }

    /**
     * TODO : 괄호 및 콤마를 어떻게 처리해야할까
     * List<String> = [ (PointX,PointY), (PointX2,PointY2) ]
     */
    @Test
    void 괄호_및_콤마를_구분지어_숫자만_가져온다() {
        //given
        //when
        int[] points = InputParseUtils.getPoints("(10,12)");

        //then
        assertThat(points).hasSize(2)
                .contains(10, 12);
    }

    
}
