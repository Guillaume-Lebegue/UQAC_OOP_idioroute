package com.ikkino.idioroute.highway.materials;

import com.ikkino.idioroute.highway.Material;

public class Ciment implements Material {

    public final float coefficient = 0.8f;

    public float getSpeed(float speed){
        return speed * coefficient;
    }

    public float getCoefficient(){
        return this.coefficient;
    }

}
