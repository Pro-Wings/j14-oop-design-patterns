package com.prowings.designpatterns.breaksingleton;

import com.prowings.designpatterns.creational.singleton.eagersingleton.EagerSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonUsingReflection {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();

        System.out.println("Reference equality : "+(instance1 == instance2));

        //lets break it using Reflection api

        EagerSingleton instance3 = null;

        Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            // setAccessible(true) bypasses the private modifier on the constructor
            constructor.setAccessible(true);
            // newInstance() creates a second instance, breaking the singleton guarantee
            instance3 = (EagerSingleton) constructor.newInstance();
            break;
        }
        System.out.println("Reference equality with broken instance : "+(instance1 == instance3));


    }

}
