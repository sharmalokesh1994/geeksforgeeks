package com.company.OOAD.Test1_Singleton_6;

import java.io.*;

// Serialization Create always new Instance

// while desealization readResolve method will be called

class DemoSingleton implements Serializable {
    private volatile static DemoSingleton instance = null;

    public static DemoSingleton getInstance() {
        if (instance == null) {
            instance = new DemoSingleton();
        }
        return instance;
    }



    protected Object readResolve() {
        return getInstance();
    }

    private int i = 10;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

public class Prac1 {static DemoSingleton instanceOne = DemoSingleton.getInstance();

    public static void main(String[] args) {
        try {
            // Serialize to a file
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                    "filename.ser"));
            out.writeObject(instanceOne);
            out.close();

            instanceOne.setI(20);

            // Serialize to a file
            ObjectInput in = new ObjectInputStream(new FileInputStream(
                    "filename.ser"));
            DemoSingleton instanceTwo = (DemoSingleton) in.readObject();
            in.close();

            System.out.println(instanceOne.getI());
            System.out.println(instanceTwo.getI());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

