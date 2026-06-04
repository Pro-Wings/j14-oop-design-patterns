package com.prowings.designpatterns.creational.factory;

public class PhonePePayment implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PhonePe payment of $" + amount);
        // Add logic to integrate with PhonePe API here
    }
}
