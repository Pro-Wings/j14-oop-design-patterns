package com.prowings.designpatterns.creational.factory;

public class TestPaymentFactory {

    public static void main(String[] args) {

        PaymentFactory paymentFactory = new PaymentFactory();

        // The user chose Stripe at checkout
        String userChoice = "CARD";

        // Let the factory handle the 'new' keyword magic
        PaymentProcessor processor = PaymentFactory.getPaymentProcessor(userChoice);

        // Run the business logic seamlessly
        processor.processPayment(250.00);
    }
}
