package com.ikkino.idioroute.car;

import java.util.List;

public abstract class Car {
    private float position;
    private float lastPosition;
    private float enterPosition;
    private List<Option> optionList;

    public void drive(){}

    public void checkCollision(){}

    public float getPosition(){
        return position;
    }

    public void setPosition(float position){
        this.position = position;
    }

    public float getEnterPosition(){
        return enterPosition;
    }

    public void setEnterPosition(float enterPosition){
        this.enterPosition = enterPosition;
    }

    public void setOptionList(List<Option> optionList){
        this.optionList = optionList;
    }
}
