package com.company.interviewbit.LLD.lec3.Test2;

import com.company.interviewbit.LLD.lec3.Test2.Address.Address;
import com.company.interviewbit.LLD.lec3.Test2.AddressValidator.India.INValidator;

public class Client {
    public static void main(String[] args) {

        Address address = new Address();
        address.setPinCode("111");
        address.setState("Rajasthan");

        INValidator inValidator = new INValidator();
        System.out.println(inValidator.validateAddress(address));

        Address address1 = new Address();
        address1.setPinCode("111");
        address1.setState("Rajasthan");
        System.out.println(inValidator.validateAddress(address1));


    }
}
