package com.ikkino.idioroute.highway;

import com.ikkino.idioroute.car.Car;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Highway {
    private final int index;
    private float radius;
    private Material material;
    private List<Car> allCars;
    private List<Interchange> allInterchange;

    public Highway(float radius, Material material, int index){
        // TODO Implement
        this.radius = radius;
        this.material = material;
        this.allCars = new ArrayList<>();
        this.index = index;
    }

    public int getIndex(){return index;}

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

    public void setAllInterchange(List<Interchange> interchanges) {
        this.allInterchange = interchanges;
    }

    public void carChangeHighway(Car car, @NotNull Interchange interchange){
        // TODO Implement
        allCars.remove(car);
        if(interchange.getInterchangeUp() == this ){
            interchange.getInterchangeDown().allCars.add(car);
            car.setHighway(interchange.getInterchangeDown());
        }
        else{
            if(interchange.getInterchangeUp() != null) {
                interchange.getInterchangeUp().allCars.add(car);
                car.setHighway(interchange.getInterchangeUp());
            }
        }
    }
}
