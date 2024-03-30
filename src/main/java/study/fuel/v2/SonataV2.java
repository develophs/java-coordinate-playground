package study.fuel.v2;

public class SonataV2 extends CarV2 {

    private final int distance;

    public SonataV2(int distance) {
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return 10;
    }

    @Override
    double getTripDistance() {
        return distance;
    }

    @Override
    String getName() {
        return "SonataV2";
    }

}
