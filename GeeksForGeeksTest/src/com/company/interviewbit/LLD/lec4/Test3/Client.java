package com.company.interviewbit.LLD.lec4.Test3;

import com.company.interviewbit.LLD.lec4.Test3.Validators.MasterValidator;

public class Client {

    public static void main(String[] args) {

        Address address = new Address();

        address.setZipCode("123456");
        address.setState("Rajasthan");
        address.setCity("Jaipur");

        System.out.println( new MasterValidator().validate(address));


    }

}
