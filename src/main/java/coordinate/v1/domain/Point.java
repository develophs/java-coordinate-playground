package coordinate.v1.domain;


public class Point {
    private static final int MIN_BOUND = 1;
    private static final int MAX_BOUND = 24;

    private final int point;

    public Point(final int point) {
        validatePoint(point);
        this.point = point;
    }

    private void validatePoint(final int point) {
        if (point < MIN_BOUND || point > MAX_BOUND) {
            throw new IllegalArgumentException("포인트 객체는 1이상 24이하의 값을 가져야합니다.");
        }
    }

}
