package com.micro.carservice.service;

import com.micro.carservice.model.Car;
import com.micro.carservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    public Car updateCar(Long id, Car updatedCar) {
        Car existingCar = carRepository.findById(id).orElseThrow();
        existingCar.setMake(updatedCar.getMake());
        existingCar.setRegistrationDetail(updatedCar.getRegistrationDetail());
        return carRepository.save(existingCar);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}