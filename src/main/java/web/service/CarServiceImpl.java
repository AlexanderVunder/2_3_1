package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("BMW", 10, 240));
        carList.add(new Car("Subaru",3,168));
        carList.add(new Car("Audi", 5,350));
        carList.add(new Car("Nissan", 12,130));
        carList.add(new Car("Toyota", 7,120));
    }

    @Override
    public List<Car> getCarByNumber(int number) {
        List<Car> res = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            res.add(carList.get(i));
        }
        return res;
    }
    @Override
    public List<Car> getAllCars() {
        return carList;
    }
}
