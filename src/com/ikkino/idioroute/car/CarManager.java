package com.ikkino.idioroute.car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.ikkino.idioroute.highway.Highway;
import com.ikkino.idioroute.highway.Interchange;

final public class CarManager {
    final private List<Car> allCars;
    final private CarFactory carFactory;

    public CarManager(){
        allCars = new ArrayList<>();
        carFactory = new CarFactory();
    }

    public void addCar(Highway where) throws CarManagerReport {
        List<Interchange> upInterchange = where.getAllInterchange().stream().filter(interchange -> interchange.getInterchangeDown() == where).collect(
                Collectors.toList());
        int pick = new Random().nextInt(upInterchange.size());
        Car newCar = carFactory.createCar();

        allCars.add(newCar);
        where.carChangeHighway(newCar, upInterchange.get(pick));
        newCar.setHighway(where);
    }

    public void driveCars() throws  CarManagerReport {
        allCars.forEach(Car::drive);
    }

    public void checkCollisions() throws CarManagerReport {
        try {
            for(Car car: allCars){
                car.checkCollision();
            }
        }catch (Breakdown breakdown){

        }
    }

    public CarManagerReport createReport(String reason) {
        return new CarManagerReport(this.allCars, reason);
    }
}
