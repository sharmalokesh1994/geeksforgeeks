package com.company.interviewbit.LLD.lec4.Test2.Validators;

import com.company.interviewbit.LLD.lec4.Test2.Address;

public class MasterValidator {

    // It can not handle grouping as well
    // For example one client want to check zipcode only (ServiceAvailability)
    // 2nd client want to check zipcode, city abd state(AmazonPrime)
    // 3rd client want to check everything
    // So we will create a list
    public boolean validate(Address address){

        ZipCodeValidator zipCodeValidator = new ZipCodeValidator();
        StateValidator stateValidator = new StateValidator();
        CityValidator cityValidator = new CityValidator();

        // Many && operator make this code Messy
        return zipCodeValidator.validate(address)
                && stateValidator.validate(address)
                && cityValidator.validate(address)
                && new CityStateValidator().validate(address);

    }

}
