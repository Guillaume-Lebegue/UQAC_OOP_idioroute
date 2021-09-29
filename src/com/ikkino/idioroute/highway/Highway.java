package com.ikkino.idioroute.highway;

public class Highway {
    private float radius;
    private Material material;

    public Highway(float radius, Material material){
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
