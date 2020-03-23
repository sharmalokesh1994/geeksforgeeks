package com.company.interviewbit.LLD.lec4.Test3.Validators;

import com.company.interviewbit.LLD.lec4.Test3.Address;

public class StateValidator implements Validator{


    public boolean validate(Address add){

        return add.getState().equals("Rajasthan");

    }

}
