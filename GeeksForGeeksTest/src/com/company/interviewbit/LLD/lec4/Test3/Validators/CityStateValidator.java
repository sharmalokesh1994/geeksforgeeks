package com.company.interviewbit.LLD.lec4.Test3.Validators;

import com.company.interviewbit.LLD.lec4.Test3.Address;

public class CityStateValidator implements Validator{

    public boolean validate(Address add){

        return add.getCity().equals("Jaipur");

    }

}
