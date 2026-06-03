package com.prowings.designpatterns.creational.singleton.doublechecklockingsingleton;

/*
Advantages:
 * 1. Thread-safe: The double-checked locking pattern ensures that only one thread can create the instance.
 * 2. Gives lazy initialization: The instance is created only when it is needed.
 * 3. Better performance: Once the instance is created, there is no need for synchronization.
 */

public class DoubleCheckLockingSingleton {

    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton()
    {

    }

    public static DoubleCheckLockingSingleton getInstance()
    {
        // First check: avoid acquiring the lock if the instance is already created
        if(instance == null)
        {
            // Synchronize only during the brief initialization window
            synchronized(DoubleCheckLockingSingleton.class)
            {
                // Second check: prevent duplicate creation if two threads passed the first check
                if(instance == null)
                {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}
