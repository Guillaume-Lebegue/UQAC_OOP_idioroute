package com.ikkino.idioroute.car;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CarManagerReport extends Error {
    final private List<Car> allCars;

    @Nullable
    final private Car concernedCar;
    final private String reason;

    public CarManagerReport(List<Car> allCars,
                            String reason) {
        this(allCars, reason, null);
    }

    public CarManagerReport(List<Car> allCars,
                            String reason, @Nullable Car concernedCar) {
        super("Car Manager created a report for this reason: " + reason);
        this.allCars = allCars;
        this.concernedCar = concernedCar;
        this.reason = reason;
    }

    public List<Car> getAllCars() {
        return allCars;
    }

    @Nullable
    public Car getConcernedCar() {
        return concernedCar;
    }

    public String getReason() {
        return reason;
    }
}
