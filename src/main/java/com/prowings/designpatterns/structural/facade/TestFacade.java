package com.prowings.designpatterns.structural.facade;

//Client
public class TestFacade {

    public static void main(String[] args) {

        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder();

    }
}
