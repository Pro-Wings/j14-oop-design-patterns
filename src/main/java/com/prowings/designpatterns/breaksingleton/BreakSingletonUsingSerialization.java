package com.prowings.designpatterns.breaksingleton;

import com.prowings.designpatterns.creational.singleton.eagersingleton.EagerSingleton;

import java.io.*;

public class BreakSingletonUsingSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        EagerSingleton instance1 = EagerSingleton.getInstance();

            // Serialize the singleton instance to a file
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("abc.ser"));
        out.writeObject(instance1);
        out.close();

        // Default deserialization bypasses the constructor and creates a new instance
        ObjectInput in = new ObjectInputStream(new FileInputStream("abc.ser"));
        EagerSingleton instance2 = (EagerSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode="+instance1.hashCode());
        System.out.println("instanceTwo hashCode="+instance2.hashCode());

        System.out.println("Reference equality : "+(instance1 == instance2));

    }
}
