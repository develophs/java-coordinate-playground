package study.fuel.v2;

public class K5V2 extends CarV2 {

    private final int distance;

    public K5V2(int distance) {
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return 13;
    }

    @Override
    double getTripDistance() {
        return distance;
    }

    @Override
    String getName() {
        return "K5V2";
    }

}
