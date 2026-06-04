package com.prowings.designpatterns.creational.builder;

public class Car {

    //mandatory fields
    private final String companyName;
    private final String engine;
    private final int wheels;

    //optional fields
    private final String gearBoxType;
    private final boolean hasMusicPlayer;
    private final boolean hasAc;
    private final boolean hasSunroof;

    private Car(CarBuilder carBuilder)
    {
        this.companyName = carBuilder.companyName;
        this.engine = carBuilder.engine;
        this.wheels = carBuilder.wheels;
        this.gearBoxType = carBuilder.gearBoxType;
        this.hasMusicPlayer = carBuilder.hasMusicPlayer;
        this.hasAc = carBuilder.hasAc;
        this.hasSunroof = carBuilder.hasSunroof;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public String getGearBoxType() {
        return gearBoxType;
    }

    public boolean isHasMusicPlayer() {
        return hasMusicPlayer;
    }

    public boolean isHasAc() {
        return hasAc;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    @Override
    public String toString() {
        return "Car{" +
                "companyName='" + companyName + '\'' +
                ", engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", gearBoxType='" + gearBoxType + '\'' +
                ", hasMusicPlayer=" + hasMusicPlayer +
                ", hasAc=" + hasAc +
                ", hasSunroof=" + hasSunroof +
                '}';
    }

    //1. Write public static inner class CarBuilder
    public static class CarBuilder {
        //mandatory fields
        private final String companyName;
        private final String engine;
        private final int wheels;

        //optional fields
        private String gearBoxType;
        private boolean hasMusicPlayer;
        private boolean hasAc;
        private boolean hasSunroof;

        public CarBuilder(String companyName, String engine, int wheels) {
            this.companyName = companyName;
            this.engine = engine;
            this.wheels = wheels;
        }

        public CarBuilder gearBoxType(String gearBoxType) {
            this.gearBoxType = gearBoxType;
            return this;
        }

        public CarBuilder hasMusicPlayer(boolean hasMusicPlayer)
        {
            this.hasMusicPlayer = hasMusicPlayer;
            return this;
        }
        public CarBuilder hasAc(boolean hasAc)
        {
            this.hasAc = hasAc;
            return this;
        }

        public CarBuilder hasSunroof(boolean hasSunroof)
        {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Car build()
        {
            return new Car(this);
        }
    }

}
