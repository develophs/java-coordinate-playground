package coordinate.v1.domain;

import java.util.List;

public class ShapeFactory {

    public static Shape from(final List<String> inputs) {
        final int size = inputs.size();
        if (size == 2) {
            return new Line(inputs);
        }
        if (size == 3) {
            return new Triangle(inputs);
        }
        if (size == 4) {
            return new Rectangle(inputs);
        }
        throw new IllegalArgumentException("입력값은 2, 3, 4 중 하나의 값을 가져야합니다.");
    }

}
