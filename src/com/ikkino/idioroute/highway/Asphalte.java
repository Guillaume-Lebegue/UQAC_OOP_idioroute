package com.ikkino.idioroute.highway;

public class Asphalte implements Material{

    private final float coefficient = 1.4;

    public float getSpeed(float speed){
        return speed * coefficient;
    }

    public float getCoefficient(){
        return this.coefficient;
    }
}
