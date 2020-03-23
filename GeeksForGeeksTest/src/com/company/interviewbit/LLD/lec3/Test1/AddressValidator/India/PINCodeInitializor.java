package com.company.interviewbit.LLD.lec3.Test1.AddressValidator.India;

import java.util.HashSet;
import java.util.Set;

public class PINCodeInitializor {

    Set<String> zipcode = null;

    // We will Initialize the Set variable inside the constructor


    // Whenever the object will get created it will be called again and again
    // So we will make it private (Singleton class)
    PINCodeInitializor(){

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

}
