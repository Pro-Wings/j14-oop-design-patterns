package com.prowings.designpatterns.structural.decorator;

//Concrete Decorator
public class SugerDecorator extends CoffeeDecorator{

    public SugerDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Suger";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 30.0; // Additional cost for suger
    }
}
