package study.fuel.abstractclazz;


import java.util.Objects;

public class Distance {

    private final int distance;

    public Distance(final int distance) {
        validateDistance(distance);
        this.distance = distance;
    }

    private void validateDistance(final int distance) {
        if (distance <= 0) {
            throw new IllegalArgumentException("이동 거리는 0이하의 숫자를 가질 수 없습니다.");
        }
    }

    public int getValue() {
        return distance;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distance distance1 = (Distance) o;
        return distance == distance1.distance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(distance);
    }
}
