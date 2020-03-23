package com.company.interviewbit.LLD.lec3.Test6.AddressValidator.India;

public class StateValidator {

    public static boolean validateState(String state){

        return new StateInitializer().states.contains(state);
    }
}
