package com.prowings.designpatterns.creational.threadsafesingleton;

/*Advantages:
 * 1. Thread-safe: The synchronized keyword ensures that only one thread can access the getInstance method
 * 2. Gives lazy initialization
 *
 * Disadvantage :
 * 1. Performance overhead: Synchronization can lead to performance issues, especially if getInstance is called frequently, as it will block other threads until the lock is released.
 * 2. Not efficient: Even after the instance is initialized, every call to getInstance
 */

public class ThreadSafeSingleton {

    //why instance defined as volatile? - to ensure visibility of changes to instance across threads. When one thread initializes the instance, other threads will see the updated value of instance variable.
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton()
    {

    }

    public static synchronized ThreadSafeSingleton getInstance()
    {
        if(instance == null)
        {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

}
