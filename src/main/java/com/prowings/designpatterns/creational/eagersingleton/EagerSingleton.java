package com.prowings.designpatterns.creational.eagersingleton;

/**
 * Advantages:
 * 1. Thread-safe by default
 * 2. Simple to implement
 * Disadvantages:
 * 1. Instance is created even if it might not be used, leading to resource wastage.
 * 2. No provision of handling Exception in constructor
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton()
    {

    }

    public static EagerSingleton getInstance()
    {
        return instance;
    }

}

