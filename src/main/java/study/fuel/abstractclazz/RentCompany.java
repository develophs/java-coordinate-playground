package study.fuel.abstractclazz;

import java.util.stream.Collectors;

public class RentCompany {

    public static final String NEWLINE = System.getProperty("line.separator");
    private static RentCompany instance;

    private static Cars cars;

    public static RentCompany create() {
        if (instance == null) {
            instance = new RentCompany();
        }
        if (cars == null) {
            cars = new Cars();
        }
        return instance;
    }

    public String generateReport() {
        return cars.getCars().stream().map(Car::report).collect(Collectors.joining(NEWLINE));
    }

    public void addCar(final Car car) {
        cars.add(car);
    }
}
