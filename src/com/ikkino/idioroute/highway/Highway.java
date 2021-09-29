package com.ikkino.idioroute.highway;

public class Highway {
    private float radius;
    private Material material;

    public Highway(float radius, Material material){
        // TODO Implement
        this.radius = radius;
        this.material = material;
    }

    public float getRadius() {
        // TODO Implement
        return radius;
    }

    public float getSpeed(){
        // TODO Implement
        return material.getSpeed();
    }
}
