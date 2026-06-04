package com.prowings.designpatterns.creational.factory;

public class PaypalPayment implements PaymentProcessor{

    @Override
    public void processPayment(double amount) {
        // Simulate PayPal payment processing logic
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
