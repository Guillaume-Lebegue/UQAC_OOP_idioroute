package com.ikkino.idioroute.Highway;

public class Highway {
    private float radius;
    private AbMaterial material;

    public Highway(float radius, AbMaterial material){
        this.radius = radius;
        this.material = material;
    }

    public float getRadius() {
        return radius;
    }

    public float getSpeed(){
        return material.getSpeed();
    }
}
