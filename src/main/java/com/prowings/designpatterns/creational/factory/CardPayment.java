package com.prowings.designpatterns.creational.factory;

public class CardPayment implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing CARD payment of $" + amount);
        // Add logic to process UPI payment
    }
}
