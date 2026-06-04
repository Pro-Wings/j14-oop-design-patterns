package com.prowings.designpatterns.creational.abstractfactory;

public class LuxuryCarFactory implements CarComponentsFactory{
    @Override
    public Engine createEngine() {
        return new V12Engine();
    }

    @Override
    public Seat createSeats() {
        return new LeatherSeat();
    }
}
