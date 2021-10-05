package com.ikkino.idioroute.car;

public abstract class Breakdown extends Exception {

    private Car concernedCar;

    public Breakdown(Car concernedCar){
        this.concernedCar = concernedCar;
    }

    public String getMessage() {
        return super.getMessage() + " Accident !";
    }

    public Car getConcernedCar(){
        return concernedCar;
    }
}
