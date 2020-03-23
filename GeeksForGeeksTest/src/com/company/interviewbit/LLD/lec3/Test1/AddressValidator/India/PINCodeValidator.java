package com.company.interviewbit.LLD.lec3.Test1.AddressValidator.India;

public class PINCodeValidator {

    public static boolean validatePINCode(String pinCode){

        PINCodeInitializor pinCodeInitializor = new PINCodeInitializor();
        return pinCodeInitializor.zipcode.contains(pinCode);
    }

}
