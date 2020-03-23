package com.company.OOAD.Test1_Singleton_2;

//Lazy Initialization

class SingletonExample{


    private static SingletonExample singletonExample = null;

    private SingletonExample(){}

    public static SingletonExample getInstance(){

        // Not ThreadSafe
        if(singletonExample==null){
            singletonExample = new SingletonExample();
        }

        return singletonExample;
    }

}

public class Prac1 {


    public static void main(String[] args) {

        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();

        System.out.println(obj1==obj2);

    }

}
