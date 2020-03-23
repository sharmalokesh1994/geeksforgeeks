package com.company.interviewbit.LLD.lec3.Test4.AddressValidator.UK;


import com.company.interviewbit.LLD.lec3.Test4.Address.Address;

public class UKValidator {

    public boolean validateAddress(Address address){

        // We will check for both state and PinCode then we can return
        // Here we are just checking only PinCode

        return PINCodeValidator.validatePINCode(address.getPinCode()) &&
                CountyValidator.validateState(address.getCounty());
    }
}

