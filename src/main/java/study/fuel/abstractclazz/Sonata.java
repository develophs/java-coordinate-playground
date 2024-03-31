package study.fuel.abstractclazz;

public class Sonata extends Car {

    private int efficiency = 10;

    public Sonata(final int distance) {
        super(distance);
    }

    @Override
    protected int getFuel() {
        return super.getDistance() / this.efficiency;
    }
}
