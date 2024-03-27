package study.v2;

public class CoffeeV2 extends Beverage {

    @Override
    protected void brew() {
        System.out.println("필터를 활용해 커피를 내린다.");
    }

    @Override
    protected void addSomething() {
        System.out.println("설탕과 우유를 추가한다.");
    }
}
