package com.ikkino.idioroute.car.breakdowns;

import com.ikkino.idioroute.car.Breakdown;
import com.ikkino.idioroute.car.Car;

public class Crash extends Breakdown {
    private Car otherCar;
    public Crash(Car concernedCar, Car otherCar){
        super(concernedCar);
        this.otherCar = otherCar;
    }

    public String getMessage(){
        return "J'ai eu un accident avec " + otherCar.getDisplay();
    }
}
