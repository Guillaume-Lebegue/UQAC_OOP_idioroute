package com.ikkino.idioroute.car;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

final public class CarManager {
    final private List<Car> allCars;
    final private CarBuilder carBuilder;

    public CarManager(){
        allCars = new ArrayList<>();
        carBuilder = new CarBuilder();
    }

    @Nullable
    public CarManagerReport addCar(){
        Car newCar = carBuilder.createCar();
        allCars.add(newCar);
        return null;
    }

    @Nullable
    public CarManagerReport driveCars(){
        allCars.forEach(Car::drive);
        return null;
    }

    @Nullable
    public CarManagerReport checkCollisions(){
        allCars.forEach(Car::checkCollision);
        return null;
    }
}
