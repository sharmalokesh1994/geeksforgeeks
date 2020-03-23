package com.company.interviewbit.LLD.lec3.Test1.AddressValidator.India;

import java.util.HashSet;
import java.util.Set;

public class StateInitializer {

    Set<String> states = null;

    // We will Initialize the Set variable inside the constructor

     StateInitializer(){

        // It will read from DataBase
        // All the database related things will come in another Class
        states = new HashSet<>();
        states.add("Rajasthan");
        states.add("Maharastra");
        states.add("Punjab");
        states.add("Delhi");


    }

}
