package com.ikkino.idioroute.highway;

import com.ikkino.idioroute.car.CarManager;
import com.ikkino.idioroute.car.CarManagerReport;

final public class HighwayManager {
    final private CarManager carManager;
    final private HighwayBuilder highwayBuilder;
    final private Highway highway;

    public HighwayManager(){
        // TODO Implement
        this.carManager = new CarManager();
        this.highwayBuilder = new HighwayBuilder();
        this.highway = this.highwayBuilder.createHighway(5);
    }

    public void start(){
        int loop = 10;
        try {
            //noinspection InfiniteLoopStatement
            while (true) {
                this.carManager.addCar(this.highway);
                this.carManager.driveCars();
                this.carManager.checkCollisions();
                if (loop-- <= 0) throw this.carManager.createReport("Loop stop");
            }
        } catch (CarManagerReport report) {
            this.displayReport(report);
        }
    }

    private void displayReport(CarManagerReport report) {
        System.out.println();
        System.out.println("===================================================");
        System.out.println("Idioroute was shutdown");

        if (report.getConcernedCar() != null)
            System.out.println("Concerned car: " + report.getConcernedCar().toString());
        System.out.println("Reason: " + report.getReason());

        System.out.println();
        System.out.println("Car data dump:");
        report.getAllCars().forEach((car) -> System.out.println(car.toString()));
    }
}
