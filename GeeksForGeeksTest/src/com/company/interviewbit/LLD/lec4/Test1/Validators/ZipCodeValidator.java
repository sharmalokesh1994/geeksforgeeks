package com.company.interviewbit.LLD.lec4.Test1.Validators;

import com.company.interviewbit.LLD.lec4.Test1.Address;

public class ZipCodeValidator {

    // For this we have to create (ResourceInitializer class)

    public boolean validate(Address add){

        return add.getZipCode().equals("123456");

    }

}
