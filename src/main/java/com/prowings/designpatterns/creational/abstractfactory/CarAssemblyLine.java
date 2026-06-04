package com.prowings.designpatterns.creational.abstractfactory;

public class CarAssemblyLine {

    private final Engine carEngine;
    private final Seat carSeats;

    public CarAssemblyLine(CarComponentsFactory factory) {
        this.carEngine = factory.createEngine();
        this.carSeats = factory.createSeats();
    }

    public void testAssembledCar() {
        carEngine.start();
        carSeats.sit();
    }

    public static void main(String[] args) {

//        CarComponentsFactory carFactory = new LuxuryCarFactory();
        CarComponentsFactory carFactory = new BudgetCarFactory();

        CarAssemblyLine assemblyLine = new CarAssemblyLine(carFactory);

        assemblyLine.testAssembledCar();




    }

}
