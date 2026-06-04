package com.prowings.designpatterns.creational.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class NewCar {

    //mandatory fields
    private String companyName;
    private String engine;
    private int wheels;

    //optional fields
    private String gearBoxType;
    private boolean hasMusicPlayer;
    private boolean hasAc;
    private boolean hasSunroof;

}
