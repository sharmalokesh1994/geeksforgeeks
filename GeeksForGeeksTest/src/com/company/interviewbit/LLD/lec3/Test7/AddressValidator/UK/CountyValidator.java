package com.company.interviewbit.LLD.lec3.Test7.AddressValidator.UK;

public class CountyValidator {

    public static boolean validateState(String state){

        return new CountyInitializer().county.contains(state);
    }
}
