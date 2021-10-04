package com.ikkino.idioroute.car;

import com.ikkino.idioroute.car.cars.Ferrari;
import com.ikkino.idioroute.car.cars.FordFiesta;
import com.ikkino.idioroute.car.cars.Moto;
import com.ikkino.idioroute.car.cars.Truck;

import java.util.Random;

public class CarFactory {

    private enum CarType {
        FERRARI,
        FORDFIESTA,
        MOTO,
        TRUCK,
    }

    public Car createCar(){
        int pick = new Random().nextInt(CarType.values().length);

        switch (CarType.values()[pick]) {
            case FERRARI -> { return new Ferrari(); }
            case FORDFIESTA -> { return new FordFiesta(); }
            case MOTO -> { return new Moto(); }
            default -> { return new Truck(); }
        }
    }
}
