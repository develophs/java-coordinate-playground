package study.fuel.abstractclazz;

public class Avante extends Car {

    private int efficiency = 15;

    public Avante(final int distance) {
        super(distance);
    }

    @Override
    protected String report() {
        return this.getClass().getSimpleName() + " : " + getFuel() + "리터";
    }

    @Override
    protected int getFuel() {
        return super.getDistance() / this.efficiency;
    }
}
