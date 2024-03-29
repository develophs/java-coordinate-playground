package study.fuel.abstractclazz;

public class K5 extends Car {

    private int efficiency = 13;

    public K5(final int distance) {
        super(distance);
    }

    @Override
    protected String report() {
        return this.getClass().getName() + ":" + getFuel() + "리터\n";
    }

    @Override
    protected int getFuel() {
        return super.getDistance() / this.efficiency;
    }
}
