package com.ikkino.idioroute.highway;

public class Ciment implements Material {

    public final float coefficient = 0.8f;

    public float getSpeed(float speed){
        return speed * coefficient;
    }

    public float getCoefficient(){
        return this.coefficient;
    }

}
