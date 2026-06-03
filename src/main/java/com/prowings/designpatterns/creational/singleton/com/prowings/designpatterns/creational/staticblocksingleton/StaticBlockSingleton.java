package com.prowings.designpatterns.creational.singleton.com.prowings.designpatterns.creational.staticblocksingleton;

/*
 * Static Block Singleton Pattern
 * Advantages:
 * 1. Able to handle possible exceptions in creation.
 *
 * Disadvantages:
 * 1. Still object is eagerly created - Instance is created even if it might not be used, leading to resource wastage.
 */


public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    static
    {
        try
        {
            instance = new StaticBlockSingleton();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred while creating singleton instance: " + e.getMessage());
            //throw new RuntimeException("Exception occurred while creating singleton instance: " + e.getMessage());
        }
    }

    private StaticBlockSingleton()
    {

    }

    public static StaticBlockSingleton getInstance()
    {
        return instance;
    }


}
