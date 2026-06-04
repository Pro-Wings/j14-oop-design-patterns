package com.prowings.designpatterns.creational.abstractfactory;

public class LeatherSeat implements Seat
{

    @Override
    public void sit() {
        System.out.println("Sitting on a leather seat.");
    }
}
