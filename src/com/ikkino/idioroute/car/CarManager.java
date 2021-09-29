package com.ikkino.idioroute.car;

import java.util.ArrayList;
import java.util.List;

public class CarManager {
    private List<ABCar> allCars;
    private CarBuilder carBuilder;

    public CarManager(){
        allCars = new ArrayList<>();
        carBuilder = new CarBuilder();
    }

    public CarManagerReport driveCars(){
        for (ABCar car: allCars) {
            car.drive();
        }
        return null;
    }

    public CarManagerReport checkCollisions(){
        for (ABCar car: allCars) {
            car.checkCollision();
        }
        return null;
    }
}
