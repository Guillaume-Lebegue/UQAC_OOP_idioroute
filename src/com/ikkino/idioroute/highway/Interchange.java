package com.ikkino.idioroute.highway;

public class Interchange {
    private Highway interchangeUp;
    private Highway interchangeDown;

    public Interchange(Highway interchangeDown, Highway interchangeUp){
        // TODO Implement
        this.interchangeDown = interchangeDown;
        this.interchangeUp = interchangeUp;
    }

    public Interchange(Highway interchangeDown){
        // TODO Implement
        this.interchangeDown = interchangeDown;
        this.interchangeUp = null;
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
}
