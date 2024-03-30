package study.fuel.v2;

/**
 * 힌트 이용하여 구현
 */
public abstract class CarV2 {
    /**
     * 리터당 이동 거리. 즉, 연비
     */
    abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    abstract double getTripDistance();

    /**
     * 차종의 이름
     */
    abstract String getName();

    /**
     * 주입해야할 연료량을 구한다.
     * >> getTripDistance 및 getDistancePerLiter 메서드를 오버라이딩 하면
     * >> 오버라이딩한 메서드가 호출된다.
     */
    int getChargeQuantity() {
        return (int) (getTripDistance() / getDistancePerLiter());
    }

    /**
     * 부모 클래스에서 toString을 오버라이딩해서 Object클래스의 toString 재정의
     * 자손 클래스에서 getName()과 getChargeQuantity()가 부모의 메서드를 오버라이딩하여
     * 자손의 메서드가 호출된다.
     */
    @Override
    public String toString() {
        return getName() + " : " + getChargeQuantity() + "리터";
    }
}
