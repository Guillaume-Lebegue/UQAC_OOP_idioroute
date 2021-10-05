package com.ikkino.idioroute.car;

public abstract class Breakdown extends Exception {
// TODO Implement
    public String getMessage() {
        return super.getMessage() + " Accident !";
    }
}
