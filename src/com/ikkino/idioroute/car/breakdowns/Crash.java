package com.ikkino.idioroute.car.breakdowns;

import com.ikkino.idioroute.car.Breakdown;
import com.ikkino.idioroute.car.Car;

public class Crash extends Breakdown {

    public Crash(Car concernedCar){
        super(concernedCar);
    }

    public String getMessage(){
        return "J'ai eu un accident !";
    }
}
