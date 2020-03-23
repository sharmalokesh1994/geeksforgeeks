package com.company.interviewbit.LLD.lec4.Test2.Validators;

import com.company.interviewbit.LLD.lec4.Test2.Address;

public class CityValidator {


    public boolean validate(Address add){

        return add.getCity().equals("Jaipur");

    }

}
