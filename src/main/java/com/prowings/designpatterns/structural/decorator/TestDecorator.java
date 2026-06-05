package com.prowings.designpatterns.structural.decorator;

public class TestDecorator {

    public static void main(String[] args) {

        Coffee simpleCoffee = new BasicCoffee();
        System.out.println("Simple Coffee: " + simpleCoffee.getDescription() + "   | Cost : "+simpleCoffee.getCost());

        Coffee withMilk = new MilkDecorator(simpleCoffee);
        System.out.println("withMilk Coffee: " + withMilk.getDescription() + "   | Cost : "+withMilk.getCost());

        Coffee withMilkAndSugar = new SugerDecorator(withMilk);;
        System.out.println("withMilkAndSugar Coffee: " + withMilkAndSugar.getDescription() + "   | Cost : "+withMilkAndSugar.getCost());

        Coffee withMilkSugerAndCream = new CreamDecorator(withMilkAndSugar);
        System.out.println("withMilkSugerAndCream Coffee: " + withMilkSugerAndCream.getDescription() + "   | Cost : "+withMilkSugerAndCream.getCost());

        Coffee basicCoffeeWithCream = new CreamDecorator(new BasicCoffee());
        System.out.println("basicCoffeeWithCream Coffee: " + basicCoffeeWithCream.getDescription() + "   | Cost : "+basicCoffeeWithCream.getCost());

    }
}
