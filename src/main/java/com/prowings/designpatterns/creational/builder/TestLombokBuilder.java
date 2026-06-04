package com.prowings.designpatterns.creational.builder;

public class TestLombokBuilder {

    public static void main(String[] args) {

        NewCar car = NewCar.builder()
                .companyName("Toyota")
                .engine("V6")
                .gearBoxType("Automatic")
                .hasMusicPlayer(true)
                .hasAc(true)
                .hasSunroof(false)
                .wheels(4)
                .build();

        System.out.println(car);
    }
}
