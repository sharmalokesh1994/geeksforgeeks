package com.company.interviewbit.LLD.lec4.Test3.Validators;

import com.company.interviewbit.LLD.lec4.Test3.Address;

public class ZipCodeValidator implements Validator{

    // For this we have to create (ResourceInitializer class)

    public boolean validate(Address add){

        return add.getZipCode().equals("123456");

    }

}
