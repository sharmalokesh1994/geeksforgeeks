package com.company.interviewbit.LLD.lec3.Test7.AddressValidator.India;


import com.company.interviewbit.LLD.lec3.Test7.Address.Address;
import com.company.interviewbit.LLD.lec3.Test7.AddressValidator.Validator;

public class INValidator implements Validator {

    public boolean validateAddress(Address address){

        // We will check for both state and PinCode then we can return
        // Here we are just checking only PinCode

        return PINCodeValidator.validatePINCode(address.getPinCode()) &&
                StateValidator.validateState(address.getState());
    }
}

