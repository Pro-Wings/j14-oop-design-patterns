package com.prowings.designpatterns.creational.builder;

public class Computer {

    // All fields can be final (Immutability!)
    private final String cpu; //mandatory
    private final String ram;//mandatory
    //optional fields
    private final String storage;
    private final boolean hasGraphicsCard;
    private final boolean hasBluetooth;

    // 1. Private copy constructor: Can ONLY be called by the inner Builder class
    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
    }

    // Getters (No setters to maintain immutability)
    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public boolean hasGraphicsCard() {
        return hasGraphicsCard;
    }

    public boolean hasBluetooth() {
        return hasBluetooth;
    }

    //toString method to print Computer object


    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", hasGraphicsCard=" + hasGraphicsCard +
                ", hasBluetooth=" + hasBluetooth +
                '}';
    }

    // 2. Public Static Inner Builder Class
    public static class ComputerBuilder
    {
        private final String cpu;
        private final String ram;
        private String storage;
        private boolean hasGraphicsCard;
        private boolean hasBluetooth;

        // Builder constructor enforces MANDATORY fields
        public ComputerBuilder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        //For optionl fields proveide fluent api
        public ComputerBuilder storage(String storage)
        {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder hasGraphicsCard(boolean hasGraphicsCard)
        {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }
        public ComputerBuilder hasBluetooth(boolean hasBluetooth)
        {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        // 3. The Build Method: Instantiates the final object safely
        public Computer build()
        {
            return new Computer(this);
        }

    }

}
