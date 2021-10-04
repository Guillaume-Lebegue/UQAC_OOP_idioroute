package com.ikkino.idioroute.highway;

public class Interchange {
    private Highway interchangeUp;
    private Highway interchangeDown;
    private float position; // value in degrees

    public Interchange(){
        // TODO Implement
        this.interchangeDown = null;
        this.interchangeUp = null;
        this.position = -1;
    }

    public Interchange(Highway interchangeDown, float position){
        // TODO Implement
        this.interchangeDown = interchangeDown;
        this.interchangeUp = null;
        this.position = position;
    }

    public Highway getInterchangeDown() {
        // TODO Implement
        return interchangeDown;
    }

    public Highway getInterchangeUp() {
        // TODO Implement
        return interchangeUp;
    }

    public void setInterchangeDown(Highway interchangeDown) {
        // TODO Implement
        this.interchangeDown = interchangeDown;
    }

    public void setInterchangeUp(Highway interchangeUp) {
        // TODO Implement
        this.interchangeUp = interchangeUp;
    }

    public float getPosition(){
        return position;
    }

    public void setPosition(float position) {
        this.position = position;
    }
}
