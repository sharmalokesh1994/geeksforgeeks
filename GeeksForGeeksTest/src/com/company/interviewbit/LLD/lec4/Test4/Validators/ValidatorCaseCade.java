package com.company.interviewbit.LLD.lec4.Test4.Validators;

import com.company.interviewbit.LLD.lec4.Test4.Address;

import java.util.ArrayList;
import java.util.List;

public class ValidatorCaseCade implements Validator {

    // It can not handle grouping as well
    // For example one client want to check zipcode only (ServiceAvailability)
    // 2nd client want to check zipcode, city abd state(AmazonPrime)
    // 3rd client want to check everything
    // So we will create a list

    private List<Validator> validatorList;

    public ValidatorCaseCade(List<Validator> validatorList){
        this.validatorList = validatorList;

    }

    public boolean validate(Address address){


        // Many && operator make this code Messy

        for( Validator validator : validatorList ){
            if(validator.validate(address)==false){
                return false;
            }
        }

        return true;

    }

}
