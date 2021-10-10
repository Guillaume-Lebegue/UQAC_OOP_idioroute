package com.ikkino.idioroute.car.cars;

import com.ikkino.idioroute.car.Car;
import com.ikkino.idioroute.car.CarManager;
import com.ikkino.idioroute.car.Option;
import com.ikkino.idioroute.car.options.Climatisation;
import com.ikkino.idioroute.car.options.Radio;
import com.ikkino.idioroute.highway.Highway;

import java.util.ArrayList;
import java.util.List;

public class Ferrari extends Car {
    private final float MYSPEED = 30f;

    public Ferrari(CarManager manager){
        super(manager);
        this.speed = MYSPEED;
        this.name = "Ferrari";
        List<Option> optionList = new ArrayList<>();
        optionList.add(new Radio());
        optionList.add(new Climatisation());
        setOptionList(optionList);
    }
}
