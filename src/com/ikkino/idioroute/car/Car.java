package com.ikkino.idioroute.car;

import java.util.List;

public abstract class Car {
    private float position;
    private float lastPosition;
    private float enterPosition;
    private List<Option> optionList;

    public void drive(){
        // TODO Implement
    }

    public void checkCollision(){
        // TODO Implement
    }

    public float getPosition(){
        // TODO Implement
        return position;
    }

    public void setPosition(float position){
        // TODO Implement
        this.position = position;
    }

    public float getEnterPosition(){
        // TODO Implement
        return enterPosition;
    }

    public void setEnterPosition(float enterPosition){
        // TODO Implement
        this.enterPosition = enterPosition;
    }

    public void setOptionList(List<Option> optionList){
        // TODO Implement
        this.optionList = optionList;
    }
}
