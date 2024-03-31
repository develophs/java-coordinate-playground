package study.fuel.interfacev3;

public class AvanteV3 implements CarV3 {

    private final int distancePerLiter = 15;
    private final int tripDistance;

    public AvanteV3(final int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public int getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    public int getTripDistance() {
        return tripDistance;
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public int getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }

    @Override
    public String toString() {
        return getName() + " : " + getChargeQuantity() + "리터";
    }
}
