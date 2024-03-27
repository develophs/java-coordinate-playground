package study.v2;

/**
 * CoffeeV1과 TeaV1은 중복되는 메서드가 생성되고,
 * 특정 메서드만 타입에 따라 다르게 동작한다.
 */
public class StudyMainV2 {

    public static void main(String[] args) {
        Beverage coffee = new CoffeeV2();
        Beverage tea = new TeaV2();

        coffee.prepareRecipe();
        System.out.println();
        tea.prepareRecipe();
    }

}
