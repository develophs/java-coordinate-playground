package study.fuel.interfacev3;

public class K5V3 implements CarV3 {

    private final int distancePerLiter = 13;
    private final int tripDistance;

    public K5V3(final int tripDistance) {
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
