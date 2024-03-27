package study.v2;

/**
 * 상속을 위한 상위 클래스
 * 추상메서드, 추상클래스를 활용하여 인스턴스화를 방지한다.
 */
public abstract class Beverage {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addSomething();
    }

    private void boilWater() {
        System.out.println("물을 끓인다.");
    }

    private void pourInCup() {
        System.out.println("컵에 붓는다.");
    }

    protected abstract void brew();
    protected abstract void addSomething();
}
