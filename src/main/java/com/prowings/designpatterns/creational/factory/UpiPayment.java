package com.prowings.designpatterns.creational.factory;

public class UpiPayment implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
        // Add logic to process UPI payment
    }
}
