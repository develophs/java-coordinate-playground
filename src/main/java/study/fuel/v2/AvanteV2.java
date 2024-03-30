package study.fuel.v2;

public class AvanteV2 extends CarV2 {

    private final int distance;

    public AvanteV2(int distance) {
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return 15;
    }

    @Override
    double getTripDistance() {
        return distance;
    }

    @Override
    String getName() {
        return "AvanteV2";
    }

}
