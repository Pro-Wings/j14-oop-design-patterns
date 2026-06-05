package com.prowings.designpatterns.structural.proxy;

public class RealImage implements Image
{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading from disk : " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying real image " + fileName);
    }

}
