package com.prowings.designpatterns.creational.builder;

public class TestComputerBuilder {

    public static void main(String[] args) {

        Computer computer = new Computer.ComputerBuilder("Intel i7", "16GB")
                .storage("512GB SSD")
                .build();

        System.out.println("Computer Configuration : " + computer);


        System.out.println("======================================");

        Car car = new Car.CarBuilder("Audi","V12", 4)
                .hasAc(true)
                .hasMusicPlayer(true)
                .gearBoxType("AMT")
                .build();

        System.out.println("Car : " + car);


    }
}
