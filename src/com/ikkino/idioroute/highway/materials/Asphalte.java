package com.ikkino.idioroute.highway.materials;

import com.ikkino.idioroute.highway.Material;

public class Asphalte implements Material {

    public final float coefficient = 1.4f;

    public float getSpeed(float speed){
        return speed * coefficient;
    }

    public float getCoefficient(){
        return this.coefficient;
    }
}
