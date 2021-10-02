package com.ikkino.idioroute.highway;

import com.ikkino.idioroute.car.Car;

import java.util.List;

public class Highway {
    private float radius;
    private Material material;
    private List<Car> allCars;
    private List<Interchange> allInterchange;

    public Highway(float radius, Material material){
        // TODO Implement
        this.radius = radius;
        this.material = material;
    }

    public float getRadius() {
        return radius;
    }

    public float getSpeed(float speed){
        return material.getSpeed(speed);
    }

    public List<Car> getAllCars(){
        return allCars;
    }

    public List<Interchange> getAllInterchange(){
        return allInterchange;
    }

    public void carChangeHighway(Car car, Interchange interchange){
        // TODO Implement
        allCars.remove(car);
        if(interchange.getInterchangeUp() == this ){
            interchange.getInterchangeDown().allCars.add(car);
        }
        else{
            interchange.getInterchangeUp().allCars.add(car);
        }
    }
}
