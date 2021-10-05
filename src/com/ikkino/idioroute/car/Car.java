package com.ikkino.idioroute.car;

import com.ikkino.idioroute.car.breakdowns.Crash;
import com.ikkino.idioroute.car.breakdowns.OutOfFuel;
import com.ikkino.idioroute.highway.Highway;
import com.ikkino.idioroute.highway.Interchange;

import java.util.List;
import java.util.Random;

import static java.lang.Math.PI;

public abstract class Car {
    private float position;
    private float lastPosition;
    private float enterPosition;
    private float degreesTraveled = 0;
    private boolean hasCompleteTour = false;
    private List<Option> optionList;
    private Highway highway;
    protected float speed; // Valeur en m/s
    protected String name  = "Car";
    private Breakdown breakdown;

    public Car(){
    }

    public final void drive(){
        // TODO Implement
        if(breakdown == null) {
            final float elapsedTime = 10; // 10 secondes
            float radius = highway.getRadius();
            float speed = highway.getSpeed(this.speed);
            lastPosition = position;
            float distanceHighway = (float) PI * 2 * radius;
            float distanceTraveled = speed * elapsedTime;
            float degreesTraveled = distanceTraveled / distanceHighway * 3.6f;
            this.degreesTraveled += degreesTraveled;
            position += degreesTraveled;
            position = position % 360;
            if (hasCompleteTour) {
                tryToFindInterchange();
            } else {
                if (this.degreesTraveled > 360) {
                    hasCompleteTour = true;
                }
            }
            if(Math.random() < 0.01f){
                breakdown = new OutOfFuel(this);
            }
        }
    }

    public final void checkCollision() throws Breakdown{
        // TODO Implement
        List<Car> carsOnHighway = highway.getAllCars();
        for(Car car : carsOnHighway){
            if(car != this){
                if(car.getPosition() > lastPosition && car.getPosition() < position){
                    if(!tryToFindInterchange()) {
                        breakdown = new Crash(this);
                        throw breakdown;
                    }
                }
            }
        }
    }

    private boolean tryToFindInterchange(){
        List<Interchange> interchangesOnHighway = highway.getAllInterchange();
        for(Interchange interchange: interchangesOnHighway){
            if(interchange.getPosition() < position && interchange.getPosition() > lastPosition){
                highway.carChangeHighway(this, interchange);
                setEnterPosition(interchange.getPosition());
                return true;
            }
        }
        return false;
    }

    public float getPosition(){
        return position;
    }

    public void setPosition(float position){
        this.position = position;
    }

    public float getEnterPosition(){
        return enterPosition;
    }

    private void setEnterPosition(float enterPosition){
        this.enterPosition = enterPosition;
        this.lastPosition = enterPosition;
        setPosition(enterPosition);
    }

    protected final void setOptionList(List<Option> optionList){
        // TODO Implement
        this.optionList = optionList;
    }

    public final void setHighway(Highway highway){
        this.highway = highway;
    }

    public final void display(){
        System.out.println("Je suis un(e) " + name + ". Je suis en position " + position +" et voici ma liste d'option :");
        for (Option opt: optionList) {
            opt.run();
        }
        if(breakdown != null){
            System.out.println("J'ai actuellement un problème : " + breakdown.getMessage());
        }
    }
}
