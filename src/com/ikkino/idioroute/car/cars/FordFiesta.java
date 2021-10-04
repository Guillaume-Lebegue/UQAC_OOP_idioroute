package com.ikkino.idioroute.car.cars;

import com.ikkino.idioroute.car.Car;
import com.ikkino.idioroute.car.Option;
import com.ikkino.idioroute.car.options.Climatisation;
import com.ikkino.idioroute.highway.Highway;

import java.util.ArrayList;
import java.util.List;

public class FordFiesta extends Car {
    private final float MYSPEED = 18f;

    public FordFiesta(Highway highway, float enterPosition){
        super(highway, enterPosition);
        this.speed = MYSPEED;
        List<Option> optionList = new ArrayList<>();
        optionList.add(new Climatisation());
        setOptionList(optionList);
    }
}
