package com.ikkino.idioroute.highway;

public class Asphalte extends Highway implements Material{

    private final float coefficient = 1.4;

    public float getSpeed(float speed){
        return speed * coefficient;
    }

    public float getCoefficient(){
        return this.coefficient;
    }

    public Asphalte(float radius, Material material, float coefficient) {
        super(radius, material);
        this.coefficient = coefficient;
    }
}
