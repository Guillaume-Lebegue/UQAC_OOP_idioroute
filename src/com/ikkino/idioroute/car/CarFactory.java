package com.ikkino.idioroute.car;

import com.ikkino.idioroute.car.cars.Ferrari;
import com.ikkino.idioroute.car.cars.FordFiesta;
import com.ikkino.idioroute.car.cars.Moto;
import com.ikkino.idioroute.car.cars.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarFactory {

    final private List<Car> carTypes = new ArrayList<>(List.of(new Ferrari(), new FordFiesta(), new Moto(), new Truck()));

    public Car createCar(){
        Random rand = new Random();

        return carTypes.get(rand.nextInt(this.carTypes.size()));
    }
}
