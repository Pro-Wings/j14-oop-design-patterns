package com.prowings.designpatterns.creational.abstractfactory;

public interface CarComponentsFactory {
    public Engine createEngine();
    public Seat createSeats();
}
