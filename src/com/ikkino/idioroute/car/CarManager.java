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
        carFactory = new CarFactory(this);
    }

    public void addCar(Highway where) throws CarManagerReport {
        List<Interchange> upInterchange = where.getAllInterchange().stream().filter(interchange -> interchange.getInterchangeDown() == where).collect(
                Collectors.toList());
        int pick = new Random().nextInt(upInterchange.size());
        Car newCar = carFactory.createCar();

        allCars.add(newCar);
        newCar.init(where, upInterchange.get(pick));
    }

    public void removeCar(Car car) {
        allCars.remove(car);
    }

    public void driveCars() throws  CarManagerReport {
        allCars.forEach(Car::drive);
    }

    public void checkCollisions() throws CarManagerReport {
        try {
            for (int i = 0; i < allCars.size(); i++){
                Car car = allCars.get(i);
                car.checkCollision();
                if(car.deleteMe()){
                    allCars.remove(car);
                    i--;
                    System.out.println("Je sors de l'autoroute !");
                }
            }
        }catch (Breakdown breakdown){
            throw new CarManagerReport(this.allCars, breakdown.getMessage(), breakdown.getConcernedCar());
        }
    }

    public CarManagerReport createReport(String reason) {
        return new CarManagerReport(this.allCars, reason, null);
    }
}
