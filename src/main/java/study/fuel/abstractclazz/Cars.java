package study.fuel.abstractclazz;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public void add(final Car car) {
        validateSize();
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    private void validateSize() {
        if (cars.size() >= 5) {
            throw new IllegalStateException("등록 가능한 자동차는 5대까지 입니다.");
        }
    }

}
