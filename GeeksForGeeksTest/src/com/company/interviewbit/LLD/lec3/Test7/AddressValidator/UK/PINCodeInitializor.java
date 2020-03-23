package com.company.interviewbit.LLD.lec3.Test7.AddressValidator.UK;

import java.util.HashSet;
import java.util.Set;

public class PINCodeInitializor {

    // for flexibility We will make this variable private
    private Set<String> zipcode = null;

    // We will Initialize the Set variable inside the constructor


    // Whenever the object will get created it will be called again and again
    // So we will make it private (Singleton class)
    private PINCodeInitializor(){

        // It will read from DataBase
        // All the database related things will come in another Class
        zipcode = new HashSet<>();
        zipcode.add("111");
        zipcode.add("112");
        zipcode.add("113");
        zipcode.add("114");
        zipcode.add("115");
        zipcode.add("116");

    }

    private static PINCodeInitializor instance;

    public static PINCodeInitializor getInstance(){

        if( instance==null ){

            synchronized (PINCodeInitializor.class){
                if( instance==null ){
                    instance = new PINCodeInitializor();
                }
            }
        }
        return instance;
    }

    public Set<String> getZipcode() {
        return zipcode;
    }
}
