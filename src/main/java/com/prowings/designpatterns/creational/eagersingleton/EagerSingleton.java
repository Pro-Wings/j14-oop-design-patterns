package com.prowings.designpatterns.creational.eagersingleton;

import java.io.Serializable;

/**
 * Advantages:
 * 1. Thread-safe by default
 * 2. Simple to implement
 * Disadvantages:
 * 1. Instance is created even if it might not be used, leading to resource wastage.
 * 2. No provision of handling Exception in constructor
 */
public class EagerSingleton implements Serializable
{

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton()
    {
        // Block reflective instantiation after the singleton is created
        if (instance != null) {
            throw new IllegalStateException(
                    "Singleton instance already exists. Use getInstance() instead."
            );
        }
    }

    public static EagerSingleton getInstance()
    {
        return instance;
    }

    // readResolve() is called by the JVM after deserialization; returning getInstance()
    // causes the JVM to discard the deserialized object and return the existing instance
    protected Object readResolve() {
        return getInstance();
    }

}

