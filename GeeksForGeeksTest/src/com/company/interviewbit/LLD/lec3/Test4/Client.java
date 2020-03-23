package com.company.interviewbit.LLD.lec3.Test4;

import com.company.interviewbit.LLD.lec3.Test4.Address.Address;
import com.company.interviewbit.LLD.lec3.Test4.AddressValidator.India.INValidator;
import com.company.interviewbit.LLD.lec3.Test4.AddressValidator.UK.UKValidator;

public class Client {
    public static void main(String[] args) {

        Address address = new Address();
        address.setPinCode("111");
        address.setState("Rajasthan");

        // It will make design very difficult
        // because user has to create each class Object by himself
        INValidator inValidator = new INValidator();
        System.out.println(inValidator.validateAddress(address));

        Address address1 = new Address();
        address1.setPinCode("111");
        address1.setCounty("Rajasthan");

        UKValidator ukValidator = new UKValidator();

        System.out.println(ukValidator.validateAddress(address1));


    }
}
