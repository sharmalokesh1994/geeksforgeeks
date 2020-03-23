package com.company.interviewbit.LLD.lec3.Test5.AddressValidator.UK;

public class CountyValidator {

    public static boolean validateState(String state){

        return new CountyInitializer().county.contains(state);
    }
}
