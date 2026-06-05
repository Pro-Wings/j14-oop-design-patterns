package com.prowings.designpatterns.structural.adapter;
//Adapter
public class ChargerAdapter implements IndianCharger {

    private USLaptopCharger usCharger;

    public ChargerAdapter(USLaptopCharger usCharger) {
        this.usCharger = usCharger;
    }

    @Override
    public void chargeWithIndianPin() {
        System.out.println("Adapter converts Us pin to Indian pin.");
        usCharger.chargeWithUSPin();
    }
}
