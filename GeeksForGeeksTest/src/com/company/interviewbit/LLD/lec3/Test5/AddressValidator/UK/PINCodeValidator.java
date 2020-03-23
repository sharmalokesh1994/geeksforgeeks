package com.company.interviewbit.LLD.lec3.Test5.AddressValidator.UK;


public class PINCodeValidator {

    public static boolean validatePINCode(String pinCode){

        PINCodeInitializor pinCodeInitializor = PINCodeInitializor.getInstance();
        // if user will use directly this
        // Then there are some drawbacks also
        return pinCodeInitializor.getZipcode().contains(pinCode);
    }

}
