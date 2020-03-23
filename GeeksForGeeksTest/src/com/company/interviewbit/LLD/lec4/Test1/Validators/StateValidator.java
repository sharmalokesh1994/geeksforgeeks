package com.company.interviewbit.LLD.lec4.Test1.Validators;

import com.company.interviewbit.LLD.lec4.Test1.Address;

public class StateValidator {


    public boolean validate(Address add){

        return add.getState().equals("Rajasthan");

    }

}
