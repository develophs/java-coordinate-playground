package study.fuel.abstractclazz;


import java.util.Objects;

public class Efficiency {

    private final int efficiency;

    public Efficiency(final int efficiency) {
        validateEfficiency(efficiency);
        this.efficiency = efficiency;
    }

    private void validateEfficiency(final int efficiency) {
        if (efficiency <= 0) {
            throw new IllegalArgumentException("연비는 0이하의 숫자를 가질 수 없습니다.");
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Efficiency that = (Efficiency) o;
        return efficiency == that.efficiency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(efficiency);
    }
}
