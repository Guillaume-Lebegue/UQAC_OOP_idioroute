package com.ikkino.idioroute.car;

import com.ikkino.idioroute.highway.Highway;
import com.ikkino.idioroute.highway.Interchange;

import java.util.List;

import static java.lang.Math.PI;

public abstract class Car {
    private float position;
    private float lastPosition;
    private float enterPosition;
    private float speed; // Valeur en m/s
    private float degreesTraveled;
    private boolean hasCompleteTour;
    private List<Option> optionList;
    private Highway highway;

    public void drive(){
        // TODO Implement
        final float elapsedTime = 10; // 10 secondes
        float radius = highway.getRadius();
        float speed = highway.getSpeed(this.speed);
        lastPosition = position;
        float distanceHighway = (float)PI * 2 * radius;
        float distanceTraveled = speed * elapsedTime;
        float degreesTraveled = distanceTraveled / distanceHighway * 3.6f;
        this.degreesTraveled += degreesTraveled;
        position += degreesTraveled;
        position = position % 360;
        if(hasCompleteTour){
            tryToFindInterchange();
        }else {
            if (this.degreesTraveled > 360) {
                hasCompleteTour = true;
            }
        }
    }

    public void checkCollision() throws Breakdown{
        // TODO Implement
        List<Car> carsOnHighway = highway.getAllCars();
        for(Car car : carsOnHighway){
            if(car != this){
                if(car.getPosition() > lastPosition && car.getPosition() < position){
                    throw new Breakdown() {
                        @Override
                        public String getMessage() {
                            return super.getMessage() + " Accident !";
                        }
                    };
                }
            }
        }
    }

    private void tryToFindInterchange(){
        List<Interchange> interchangesOnHighway = highway.getAllInterchange();
        for(Interchange interchange: interchangesOnHighway){
            if(interchange.getPosition() < position && interchange.getPosition() > lastPosition){
                highway.carChangeHighway(this, interchange);
            }
        }
    }

    public float getPosition(){
        return position;
    }

    private void setPosition(float position){
        this.position = position;
    }

    public float getEnterPosition(){
        return enterPosition;
    }

    public void setEnterPosition(float enterPosition){
        this.enterPosition = enterPosition;
    }

    public void setOptionList(List<Option> optionList){
        // TODO Implement
        this.optionList = optionList;
    }
}
