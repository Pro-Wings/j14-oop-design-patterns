package com.prowings.designpatterns.structural.adapter;

//Client
public class TestAdapter {

    public static void main(String[] args) {

        USLaptopCharger usLaptopCharger = new USLaptopCharger();

        // Using the adapter to charge a laptop with US charger

        IndianCharger indianCharger = new ChargerAdapter(usLaptopCharger);

        indianCharger.chargeWithIndianPin();

    }
}
