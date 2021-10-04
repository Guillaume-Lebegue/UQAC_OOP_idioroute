package com.ikkino.idioroute.highway;

public class Pave implements Material{

    public final float coefficient = 0.6f;

    public float getSpeed(float speed){
        return speed * coefficient;
    }

    public float getCoefficient(){
        return this.coefficient;
    }
}
