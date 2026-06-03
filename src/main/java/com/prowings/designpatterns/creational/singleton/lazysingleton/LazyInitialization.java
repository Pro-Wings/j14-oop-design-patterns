package com.prowings.designpatterns.creational.singleton.lazysingleton;

/*
 * Lazy Initialization Singleton Pattern
 * Advantages:
 * 1. Object is created only when needed.
 * 2. Resource utilization is better.
 * 3. Can handle exception in factory method while creation of object
 *
 * Disadvantages:
 * 1. Not Thread safe - in case multiple threads access getInstance method at the same time, multiple instances can be created.
 *
 */

public class LazyInitialization {


    private static LazyInitialization instance;

    private LazyInitialization()
    {}

    public static LazyInitialization getInstance()
    {
        if(null == instance)
        {
            instance = new LazyInitialization();
        }
        return instance;
    }

}
