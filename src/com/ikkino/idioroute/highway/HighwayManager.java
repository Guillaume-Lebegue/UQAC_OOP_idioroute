package com.ikkino.idioroute.highway;

import com.ikkino.idioroute.car.CarManager;

import java.util.List;

final public class HighwayManager {
    final private CarManager carManager;
    final private HighwayBuilder highwayBuilder;
    final private List<Highway> highwayList;

    public HighwayManager(){
        // TODO Implement
        carManager = new CarManager();
        highwayBuilder = new HighwayBuilder();
        highwayList = highwayBuilder.createHighway(5);
    }

    public void start(){
        // TODO Implement
        System.out.println("Vroum vroum les voitures !");
    }
}
