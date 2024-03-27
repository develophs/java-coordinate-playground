package study.v1;

/**
 * CoffeeV1과 TeaV1은 중복되는 메서드가 생성되고,
 * 특정 메서드만 타입에 따라 다르게 동작한다.
 */
public class StudyMainV1 {

    public static void main(String[] args) {
        CoffeeV1 coffeeV1 = new CoffeeV1();
        TeaV1 teaV1 = new TeaV1();

        coffeeV1.prepareRecipe();
        System.out.println();
        teaV1.prepareRecipe();
    }

}
