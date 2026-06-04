package com.prowings.designpatterns.creational.abstractfactory;

public class BudgetCarFactory implements CarComponentsFactory{
    @Override
    public Engine createEngine() {
        return new ThreeCylinderEngine();
    }

    @Override
    public Seat createSeats() {
        return new FabricSeat();
    }
}
