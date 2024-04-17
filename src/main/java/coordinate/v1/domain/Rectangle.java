package coordinate.v1.domain;

import java.util.List;

public class Rectangle extends Shape {

    public Rectangle(final List<String> points) {
        super(points);
    }

    @Override
    public double calculate() {
        return 0.0;
    }
}
