package coordinate.v1.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PointTest {

    @ParameterizedTest
    @CsvSource({"1", "24"})
    void Point_객체는_1이상_24이하의_값을_가질_수_있다(int value) {
        //given
        Point point = new Point(value);

        //when
        //then
        assertThat(point).isNotNull();
    }

    @ParameterizedTest
    @CsvSource({"0", "25"})
    void Point_객체는_0이하_25이상의_값을_가질_수_없다(int value) {
        //given
        //when
        //then
        assertThatThrownBy(() -> {
            new Point(value);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("포인트 객체는 1이상 24이하의 값을 가져야합니다.");
    }

}
