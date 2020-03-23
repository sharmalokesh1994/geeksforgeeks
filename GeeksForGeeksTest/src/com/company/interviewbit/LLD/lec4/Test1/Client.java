package com.company.interviewbit.LLD.lec4.Test1;

import com.company.interviewbit.LLD.lec4.Test1.Validators.CityValidator;
import com.company.interviewbit.LLD.lec4.Test1.Validators.StateValidator;
import com.company.interviewbit.LLD.lec4.Test1.Validators.ZipCodeValidator;

public class Client {

    public static void main(String[] args) {

        Address address = new Address();

        address.setZipCode("123456");
        address.setState("Rajasthan");
        address.setCity("Jaipur");

        // client has to write a lot of code here
        // To avoid this we can create ValidatorCaseCade class
        ZipCodeValidator zipCodeValidator = new ZipCodeValidator();
        StateValidator stateValidator = new StateValidator();
        CityValidator cityValidator = new CityValidator();

        System.out.println( zipCodeValidator.validate(address) && stateValidator.validate(address) && cityValidator.validate(address) );


    }

}
