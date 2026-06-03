package com.prowings.designpatterns.creational.singleton.billpugsingleton;

/*
SingletonHelper is not loaded when BillPughSingleton is loaded.
The JVM loads it only when getInstance() is called for the first time,
at which point class initialization runs and INSTANCE is created.
Class initialization is inherently thread-safe because the JVM acquires
an internal lock for the duration of class initialization,
so no synchronized block or volatile field is required.

Advantages:
1. Thread-safe: The Bill Pugh Singleton implementation is thread-safe without requiring synchronization/volatile.
2. Lazy Initialization: The instance is created only when it is needed, which can save resources if the instance is never used.
3. Efficient: Since there is no synchronization/volatile overhead after the instance is created, it can be more efficient than other thread-safe singleton implementations.

Disadvantages:
1. Complexity: The Bill Pugh Singleton implementation is more complex than simpler singleton implementations, which may make it harder to understand for developers who are not familiar with the concept of static inner classes.
 */

public class BillPugSingleton {

    private BillPugSingleton() {
    }

    private static class BillPugSingletonHelper
    {
        private static final BillPugSingleton INSTANCE = new BillPugSingleton();
    }

    public static BillPugSingleton getInstance() {
        return BillPugSingletonHelper.INSTANCE;
    }
}
