package com.company.interviewbit.LLD.lec3.Test7;

import com.company.interviewbit.LLD.lec3.Test7.Address.Address;
import com.company.interviewbit.LLD.lec3.Test7.AddressValidator.India.INValidator;
import com.company.interviewbit.LLD.lec3.Test7.AddressValidator.NoValidatorFoundException;
import com.company.interviewbit.LLD.lec3.Test7.AddressValidator.UK.UKValidator;
import com.company.interviewbit.LLD.lec3.Test7.AddressValidator.Validator;
import com.company.interviewbit.LLD.lec3.Test7.AddressValidator.ValidatorFactory;

public class Client {
    public static void main(String[] args) {

        Address address = new Address();
        address.setPinCode("111");
        address.setState("Rajasthan");
        address.setCountry("IN");




        Address address1 = new Address();
        address1.setPinCode("111");
        address1.setCounty("Rajasthan");
        address1.setCountry("UK");

        Validator validator = null;

        try {
            validator = ValidatorFactory.getInstance().getValidator(address.getCountry());
            System.out.println(validator.validateAddress(address));

            validator = ValidatorFactory.getInstance().getValidator(address1.getCountry());
            System.out.println(validator.validateAddress(address1));

            validator = ValidatorFactory.getInstance().getValidator("Hello");

        }catch (NoValidatorFoundException e){
            e.printStackTrace();
        }





    }



}
