package com.ikkino.idioroute.Highway;

public class Interchange {
    private Highway interchangeUp;
    private Highway interchangeDown;

    public Interchange(Highway interchangeDown, Highway interchangeUp){
        this.interchangeDown = interchangeDown;
        this.interchangeUp = interchangeUp;
    }

    public Interchange(Highway interchangeDown){
        this.interchangeDown = interchangeDown;
        this.interchangeUp = null;
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
}
