package study.fuel.abstractclazz;

public class Avante extends Car {

    private int efficiency = 15;

    public Avante(final int distance) {
        super(distance);
    }

    @Override
    protected int getFuel() {
        return super.getDistance() / this.efficiency;
    }
}
