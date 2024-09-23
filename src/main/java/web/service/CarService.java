package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> carsGet(List<Car> cars, int number);
    List<Car> getCars();
}
