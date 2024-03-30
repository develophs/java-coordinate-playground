package study.fuel.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompanyV2 {

    private static RentCompanyV2 instance;
    private List<CarV2> cars = new ArrayList<>();

    public static RentCompanyV2 create() {
        if (instance == null) {
            instance = new RentCompanyV2();
        }
        return instance;
    }

    public void addCar(CarV2 carV2) {
        cars.add(carV2);
    }

    public String generateReport() {
        return cars.stream().map(CarV2::toString).collect(Collectors.joining(System.getProperty("line.separator")));
    }

}
