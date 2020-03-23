package com.company.OOAD.Test1_Singleton_1;

// Eager SingleTon class
// It will create Object when program starts


class SingletonExample{

    private static SingletonExample obj = new SingletonExample();

    private SingletonExample(){}

    public static SingletonExample getObj(){
        return obj;
    }

}

public class Prac1 {

    public static void main(String[] args) {

        SingletonExample obj1  = SingletonExample.getObj();
        SingletonExample obj2 = SingletonExample.getObj();

        System.out.println(obj1==obj2);


        /*try {
            Object obj3 = Class.forName("com.company.OOAD.Test1_Singleton_1.SingletonExample").newInstance();

            System.out.println(obj3.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    }

}
