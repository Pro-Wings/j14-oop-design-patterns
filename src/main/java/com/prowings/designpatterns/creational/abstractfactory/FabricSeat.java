package com.prowings.designpatterns.creational.abstractfactory;

public class FabricSeat implements Seat{
    @Override
    public void sit() {
        System.out.println("Sitting on a fabric seat.");
    }
}
