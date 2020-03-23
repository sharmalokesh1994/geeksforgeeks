package com.company.interviewbit.LLD.lec4.Test4.Validators;

import com.company.interviewbit.LLD.lec4.Test4.Address;

public class CityValidator implements Validator {


    public boolean validate(Address add){

        return add.getCity().equals("Jaipur");

    }

}
