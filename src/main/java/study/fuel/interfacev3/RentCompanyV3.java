package study.fuel.interfacev3;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompanyV3 {

    private static final String NEWLINE = System.getProperty("line.separator");

    private static RentCompanyV3 instance;
    private List<CarV3> cars = new ArrayList<>();

    public static RentCompanyV3 create() {
        if (instance == null) {
            instance = new RentCompanyV3();
        }
        return instance;
    }

    public void addCar(CarV3 carV3) {
        cars.add(carV3);
    }

    public String generateReport() {
        return cars.stream().map(CarV3::toString).collect(Collectors.joining(NEWLINE));
    }

}
