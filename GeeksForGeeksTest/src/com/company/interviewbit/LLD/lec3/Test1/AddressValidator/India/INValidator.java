package com.company.interviewbit.LLD.lec3.Test1.AddressValidator.India;

import com.company.interviewbit.LLD.lec3.Test1.Address.Address;

public class INValidator {

    public boolean validateAddress(Address address){

        // We will check for both state and PinCode then we can return
        // Here we are just checking only PinCode

        return PINCodeValidator.validatePINCode(address.getPinCode()) &&
                StateValidator.validateState(address.getState());
    }
}

