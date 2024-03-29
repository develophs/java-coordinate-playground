package study.fuel.abstractclazz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void 소나타() {
        // given
        final Car car = new Sonata(150);

        // when
        final int fuel = car.getFuel();

        // then
        assertThat(fuel).isEqualTo(15);
    }

    @Test
    void 케이파이브() {
        // given
        final Car car = new K5(260);

        // when
        final int fuel = car.getFuel();

        // then
        assertThat(fuel).isEqualTo(20);
    }

    @Test
    void 소나타2() {
        // given
        final Car car = new Sonata(120);

        // when
        final int fuel = car.getFuel();

        // then
        assertThat(fuel).isEqualTo(12);
    }

    @Test
    void 아반테() {
        // given
        final Car car = new Avante(300);

        // when
        final int fuel = car.getFuel();

        // then
        assertThat(fuel).isEqualTo(20);
    }

    @Test
    void 케이파이브2() {
        // given
        final Car car = new K5(390);

        // when
        final int fuel = car.getFuel();

        // then
        assertThat(fuel).isEqualTo(30);
    }

}