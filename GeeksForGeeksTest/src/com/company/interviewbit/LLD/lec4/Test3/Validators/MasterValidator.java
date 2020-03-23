package com.company.interviewbit.LLD.lec4.Test3.Validators;

import com.company.interviewbit.LLD.lec4.Test3.Address;

import java.util.ArrayList;
import java.util.List;

public class MasterValidator implements Validator{

    // It can not handle grouping as well
    // For example one client want to check zipcode only (ServiceAvailability)
    // 2nd client want to check zipcode, city abd state(AmazonPrime)
    // 3rd client want to check everything
    // So we will create a list

    private List<Validator> validatorList;

    public MasterValidator(){
        validatorList = new ArrayList<>();
        validatorList.add(new ZipCodeValidator());
        validatorList.add( new CityStateValidator() );
        validatorList.add(new CityStateValidator() );
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
