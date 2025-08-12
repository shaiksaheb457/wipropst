package com.micro.carservice.controller;

import com.micro.carservice.model.Car;
import com.micro.carservice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public Car create(@RequestBody Car car) {
        return carService.createCar(car);
    }

    @GetMapping
    public List<Car> getAll() {
        return carService.getAllCars();
    }

    @GetMapping("/{id}")
    public Car getById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @PutMapping("/{id}")
    public Car update(@PathVariable Long id, @RequestBody Car car) {
        return carService.updateCar(id, car);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        carService.deleteCar(id);
    }
}