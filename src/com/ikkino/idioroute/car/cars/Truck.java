package com.ikkino.idioroute.car.cars;

import com.ikkino.idioroute.car.Car;
import com.ikkino.idioroute.car.Option;
import com.ikkino.idioroute.car.options.Radio;
import com.ikkino.idioroute.highway.Highway;

import java.util.ArrayList;
import java.util.List;

public class Truck extends Car {
    private final float MYSPEED = 15f;

    public Truck(){
        super();
        this.speed = MYSPEED;
        this.name = "Camion";
        List<Option> optionList = new ArrayList<>();
        optionList.add(new Radio());
        setOptionList(optionList);
    }
}
