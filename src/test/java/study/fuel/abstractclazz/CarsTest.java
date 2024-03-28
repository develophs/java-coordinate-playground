package study.fuel.abstractclazz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarsTest {

    @Test
    void 일급콜렉션() {
        // given
        Cars cars = new Cars();

        // when
        cars.add(new Sonata(150));
        cars.add(new K5(260));

        // then
        assertThat(cars.getCars()).hasSize(2)
                .contains(new Sonata(150), new K5(260));
    }

    @Test
    void 자동차는_5대이상_등록_할_수_없다() {
        // given
        Cars cars = new Cars();
        cars.add(new Sonata(150));
        cars.add(new K5(260));
        cars.add(new Sonata(120));
        cars.add(new Avante(300));
        cars.add(new K5(390));

        // when
        // then
        assertThatThrownBy(() -> {
            cars.add(new K5(1));
        }).isInstanceOf(IllegalStateException.class)
                .hasMessage("등록 가능한 자동차는 5대까지 입니다.");
    }
}