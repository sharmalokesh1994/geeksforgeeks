package com.company.interviewbit.LLD.lec3.Test2.AddressValidator.India;

import com.company.interviewbit.LLD.lec3.Test2.AddressValidator.India.PINCodeInitializor;

public class PINCodeValidator {

    public static boolean validatePINCode(String pinCode){

        PINCodeInitializor pinCodeInitializor = PINCodeInitializor.getInstance();
        // if user will use directly this
        // Then there are some drawbacks also
        return pinCodeInitializor.zipcode.contains(pinCode);
    }

}
