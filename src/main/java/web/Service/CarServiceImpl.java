package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {}

    {
        cars = new ArrayList<Car>();
        cars.add(new Car("BMW", "5", 2020));
        cars.add(new Car("Mercedes", "Benz", 2019));
        cars.add(new Car("Volvo", "s70", 2010));
        cars.add(new Car("Lada", "Vesta", 2019));
        cars.add(new Car("Nisan", "GTR", 2006));
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> carsGet(List<Car> cars, int number){
        List<Car> carList = cars.subList(0, Math.min(number, cars.size()));
        return carList;
    }



}
