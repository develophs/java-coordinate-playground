package study.fuel.abstractclazz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class DistanceTest {

    @Test
    void 원시값인_거리를_포장한_클래스() {
        // given
        Distance distance = new Distance(1);

        // when
        boolean isEqual = distance.equals(new Distance(1));

        // then
        assertThat(isEqual).isTrue();
    }

    @Test
    void 거리는_0이하의_숫자를_가질_수_없다() {
        // given
        // when
        // then
        assertThatThrownBy(() -> {
            new Distance(0);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이동 거리는 0이하의 숫자를 가질 수 없습니다.");
    }

}