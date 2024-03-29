package study.fuel.abstractclazz;

import java.util.Objects;

public abstract class Car {

    private Distance distance;

    public Car(final int distance) {
        this.distance = new Distance(distance);
    }

    protected int getDistance() {
        return distance.getValue();
    }

    protected abstract int getFuel();

    protected abstract String report();

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(distance, car.distance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distance);
    }
}
