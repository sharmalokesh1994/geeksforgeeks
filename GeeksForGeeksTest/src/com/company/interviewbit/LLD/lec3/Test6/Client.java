package com.company.interviewbit.LLD.lec3.Test6;

import com.company.interviewbit.LLD.lec3.Test6.Address.Address;
import com.company.interviewbit.LLD.lec3.Test6.AddressValidator.India.INValidator;
import com.company.interviewbit.LLD.lec3.Test6.AddressValidator.UK.UKValidator;
import com.company.interviewbit.LLD.lec3.Test6.AddressValidator.Validator;

public class Client {
    public static void main(String[] args) {

        Address address = new Address();
        address.setPinCode("111");
        address.setState("Rajasthan");
        address.setCountry("IN");

        Validator inValidator = getMethod(address.getCountry());
        System.out.println(inValidator.validateAddress(address));

        Address address1 = new Address();
        address1.setPinCode("111");
        address1.setCounty("Rajasthan");
        address1.setCountry("UK");
        Validator ukValidator = getMethod(address1.getCountry());

        System.out.println(ukValidator.validateAddress(address1));


    }
    // If it is not prefix that which country so user has to crate new method

    // Here user has to remember all the class name
    // To avoid this we will use Factory Design Pattern
    static Validator getMethod( String country ){

        if( country.equals("IN") ){
            return new INValidator();
        }else if( country.equals("UK") ){
            return new UKValidator();
        }

        return null;
    }


}
