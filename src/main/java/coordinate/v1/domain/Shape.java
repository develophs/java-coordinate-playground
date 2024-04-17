package coordinate.v1.domain;

import java.util.List;
import java.util.Objects;

public abstract class Shape {

    private final List<String> points;

    public Shape(final List<String> points) {
        this.points = points;
    }

    public abstract double calculate();

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(points, shape.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
