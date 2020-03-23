package com.company.interviewbit.LLD.lec4.Test2.Validators;

import com.company.interviewbit.LLD.lec4.Test2.Address;

public class CityStateValidator {

    public boolean validate(Address add){

        return add.getCity().equals("Jaipur");

    }

}
