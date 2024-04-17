package coordinate.v1.domain;

import java.util.List;

public class Line extends Shape {

    public Line(final List<String> points) {
        super(points);
    }

    @Override
    public double calculate() {
        return 0.0;
    }
}
