package study.v2;

public class TeaV2 extends Beverage {

    @Override
    protected void brew() {
        System.out.println("티백을 담근다.");
    }

    @Override
    protected void addSomething() {
        System.out.println("레몬을 추가한다.");
    }

}
