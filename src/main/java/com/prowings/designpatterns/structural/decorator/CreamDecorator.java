package com.prowings.designpatterns.structural.decorator;

//Concrete Decorator
public class CreamDecorator extends CoffeeDecorator{

    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Cream";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 50.0; // Additional cost for suger
    }
}
