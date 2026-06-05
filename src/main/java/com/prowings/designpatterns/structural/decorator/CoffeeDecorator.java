package com.prowings.designpatterns.structural.decorator;

//AbstractDecorator
public abstract class CoffeeDecorator implements Coffee{

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

}
