package web.service;

import web.model.Car;
import java.util.List;

public interface CarService {

    List<Car> getCarByNumber(int number);

    List<Car> getAllCars();
}
