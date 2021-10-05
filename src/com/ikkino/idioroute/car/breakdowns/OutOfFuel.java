package com.ikkino.idioroute.car.breakdowns;

import com.ikkino.idioroute.car.Breakdown;
import com.ikkino.idioroute.car.Car;

public class OutOfFuel extends Breakdown {

    public OutOfFuel(Car concernedCar){
        super(concernedCar);
    }

    public String getMessage(){
        return "Je n'ai plus d'essence !";
    }
}
