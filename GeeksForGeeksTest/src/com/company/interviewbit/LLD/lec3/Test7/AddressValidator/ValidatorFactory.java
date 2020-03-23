package com.company.interviewbit.LLD.lec3.Test7.AddressValidator;

import com.company.interviewbit.LLD.lec3.Test7.AddressValidator.India.INValidator;
import com.company.interviewbit.LLD.lec3.Test7.AddressValidator.UK.UKValidator;

import java.util.HashMap;
// We will make it Singleton class
public class ValidatorFactory {

    private HashMap<String,Validator> validator;

    private ValidatorFactory(){
        validator = new HashMap<>();
        validator.put("IN",new INValidator());
        validator.put( "UK",new UKValidator());
    }

    private static ValidatorFactory instance = new ValidatorFactory();

    public static ValidatorFactory getInstance(){
        return instance;
    }

    public Validator getValidator( String country )throws NoValidatorFoundException{
        if( validator.containsKey(country) ){
            return validator.get(country);
        }
        throw new NoValidatorFoundException("NoValidator Found");
    }

}
