package com.company.OOAD.Test1_Singleton_8;

import java.lang.reflect.Constructor;

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
        SingletonExample obj2 = null;

        try{


            Constructor[] constructors = SingletonExample.class.getDeclaredConstructors();

            System.out.println(constructors.length);

            for( Constructor con : constructors ){
                con.setAccessible(true);

                obj2 = (SingletonExample) con.newInstance();

                break;
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(obj1==obj2);

        System.out.println(obj1);
        System.out.println(obj2);


    }


}
