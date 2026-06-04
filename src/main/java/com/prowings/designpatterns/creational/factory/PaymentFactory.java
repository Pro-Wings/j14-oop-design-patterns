package com.prowings.designpatterns.creational.factory;

public class PaymentFactory {

    public static PaymentProcessor getPaymentProcessor(String type) {
        if (type.equalsIgnoreCase("UPI")) {
            return new UpiPayment();
        } else if (type.equalsIgnoreCase("PAYPAL")) {
            return new PaypalPayment();
        } else if (type.equalsIgnoreCase("PHONEPE")) {
            return new PhonePePayment();
        } else if (type.equalsIgnoreCase("CARD")) {
            return new CardPayment();
        } else {
            throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }
}
