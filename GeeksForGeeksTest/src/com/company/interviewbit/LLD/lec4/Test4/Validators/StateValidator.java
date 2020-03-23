package com.company.interviewbit.LLD.lec4.Test4.Validators;

import com.company.interviewbit.LLD.lec4.Test4.Address;

public class StateValidator implements Validator {


    public boolean validate(Address add){

        return add.getState().equals("Rajasthan");

    }

}
