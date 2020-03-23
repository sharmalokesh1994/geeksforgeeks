package com.company.OOAD.Test1_Singleton_4;

//Lazy Initialization

class SingletonExample{


    private static SingletonExample singletonExample = null;

    private SingletonExample(){}

    // Complete Methods become Thread Safe
    public static SingletonExample getInstance(){

        if(singletonExample==null){

            synchronized( SingletonExample.class ){

                if( singletonExample==null ){
                    singletonExample = new SingletonExample();
                }

            }

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
