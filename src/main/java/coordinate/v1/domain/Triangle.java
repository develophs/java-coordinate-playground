package coordinate.v1.domain;

import java.util.List;

public class Triangle extends Shape {

    public Triangle(final List<String> points) {
        super(points);
    }

    @Override
    public double calculate() {
        return 0.0;
    }
}
