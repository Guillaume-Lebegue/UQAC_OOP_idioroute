package com.ikkino.idioroute.car;

import com.ikkino.idioroute.car.cars.Ferrari;
import com.ikkino.idioroute.car.cars.FordFiesta;
import com.ikkino.idioroute.car.cars.Moto;
import com.ikkino.idioroute.car.cars.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class CarFactory {

    private final CarManager manager;

    public CarFactory(CarManager manager) {
        this.manager = manager;
    }

    final private List<Function<CarManager, Car>> carTypes = new ArrayList<>(List.of(
            Ferrari::new,
            FordFiesta::new,
            Moto::new,
            Truck::new
    ));

    //final private List<Car> carTypes = new ArrayList<>(List.of(new Ferrari(), new FordFiesta(), new Moto(), new Truck()));

    public Car createCar(){
        Random rand = new Random();
        Function<CarManager, Car> selected = carTypes.get(rand.nextInt(this.carTypes.size()));

        return selected.apply(manager);
    }
}
