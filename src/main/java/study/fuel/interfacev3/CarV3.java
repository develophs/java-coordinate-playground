package study.fuel.interfacev3;

/**
 * 인터페이스를 이용하여 연료 주입기를 구현하라
 */
public interface CarV3 {
    /**
     * 리터당 이동 거리. 즉, 연비
     */
    int getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    int getTripDistance();

    /**
     * 차종의 이름
     */
    String getName();

    /**
     * 주입해야할 연료량을 구한다.
     * 인터페이스는 순수 추상클래스이다.
     * 모든 메서드가 추상 메서드여야한다.
     */
    int getChargeQuantity();
}
