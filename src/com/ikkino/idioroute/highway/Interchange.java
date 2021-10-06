package com.ikkino.idioroute.highway;

public class Interchange {
    private Highway interchangeUp;
    private Highway interchangeDown;
    private float position; // value in degrees

    public Interchange(){
        this.interchangeDown = null;
        this.interchangeUp = null;
        this.position = -1;
    }

    public Interchange(Highway interchangeDown, float position){
        this.interchangeDown = interchangeDown;
        this.interchangeUp = null;
        this.position = position;
    }

    public Highway getInterchangeDown() {
        return interchangeDown;
    }

    public Highway getInterchangeUp() {
        return interchangeUp;
    }

    public void setInterchangeDown(Highway interchangeDown) {
        this.interchangeDown = interchangeDown;
    }

    public void setInterchangeUp(Highway interchangeUp) {
        this.interchangeUp = interchangeUp;
    }

    public float getPosition(){
        return position;
    }

    public void setPosition(float position) {
        this.position = position;
    }
}
