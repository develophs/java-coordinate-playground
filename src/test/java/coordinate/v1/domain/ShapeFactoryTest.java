package coordinate.v1.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ShapeFactoryTest {

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList("(10,10)", "(14,15)"),
                        new Line(Arrays.asList("(10,10)", "(14,15)"))
                ),
                Arguments.of(
                        Arrays.asList("(10,10)", "(14,15)", "(20,8)"),
                        new Triangle(Arrays.asList("(10,10)", "(14,15)", "(20,8)"))
                ),
                Arguments.of(
                        Arrays.asList("(10,10)", "(22,10)", "(22,18)", "(10,18)"),
                        new Rectangle(Arrays.asList("(10,10)", "(22,10)", "(22,18)", "(10,18)"))
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void 팩토리_클래스는_입력값_받아_도형을_생성한다(final List<String> inputs, final Shape expect) {
        //given
        Shape shape = ShapeFactory.from(inputs);

        //when
        //then
        assertThat(shape).isEqualTo(expect);
    }

    @Test
    void 입력값은_2이상의_값을_가져야한다() {
        //given
        //when
        //then
        assertThatThrownBy(() -> {
            ShapeFactory.from(Arrays.asList("(10,10)"));
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("입력값은 2, 3, 4 중 하나의 값을 가져야합니다.");
    }

    @Test
    void 입력값은_4이하의_값을_가져야한다() {
        //given
        //when
        //then
        assertThatThrownBy(() -> {
            ShapeFactory.from(Arrays.asList("(10,10)", "(10,10)", "(10,10)", "(10,10)", "(10,10)"));
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("입력값은 2, 3, 4 중 하나의 값을 가져야합니다.");
    }
}
