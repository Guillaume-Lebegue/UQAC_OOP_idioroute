package com.ikkino.idioroute.highway.materials;

import com.ikkino.idioroute.highway.Material;

public class Goudron implements Material {

    public final float coefficient = 1;

    public float getSpeed(float speed){
        return speed * coefficient;
    }

    public float getCoefficient(){
        return this.coefficient;
    }
}
