package study.fuel.abstractclazz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class EfficiencyTest {

    @Test
    void 원시값인_연비를_포장한_클래스() {
        // given
        Efficiency efficiency = new Efficiency(1);

        // when
        boolean isEqual = efficiency.equals(new Efficiency(1));

        // then
        assertThat(isEqual).isTrue();
    }

    @Test
    void 연비는_0이하의_숫자를_가질_수_없다() {
        // given
        // when
        // then
        assertThatThrownBy(() -> {
            new Efficiency(0);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("연비는 0이하의 숫자를 가질 수 없습니다.");
    }

}