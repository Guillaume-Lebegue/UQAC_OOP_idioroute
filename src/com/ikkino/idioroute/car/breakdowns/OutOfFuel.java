package com.ikkino.idioroute.car.breakdowns;

import com.ikkino.idioroute.car.Breakdown;

public class OutOfFuel extends Breakdown {
    public String getMessage(){
        return "Je n'ai plus d'essence !";
    }
}
