package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarsController {

    private CarServiceImpl carService;

    @Autowired
    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }

@GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
    List<Car> carOur = carService.carsGet(carService.getCars(), count);
        model.addAttribute("carList", carOur);
    return "cars";
}
}
