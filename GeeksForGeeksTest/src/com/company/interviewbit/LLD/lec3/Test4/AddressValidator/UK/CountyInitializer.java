package com.company.interviewbit.LLD.lec3.Test4.AddressValidator.UK;

import java.util.HashSet;
import java.util.Set;

public class CountyInitializer {

    Set<String> county = null;

    // We will Initialize the Set variable inside the constructor


    // Whenever the object will get created it will be called again and again
    // So we will make it private (Singleton class)
     CountyInitializer(){

        // It will read from DataBase
        // All the database related things will come in another Class
        county = new HashSet<>();
        county.add("Rajasthan");
        county.add("Maharastra");
        county.add("Punjab");
        county.add("Delhi");


    }

}
