package com.company.interviewbit.LLD.lec4.Test4;

import com.company.interviewbit.LLD.lec4.Test4.Validators.ValidatorCaseCade;
import com.company.interviewbit.LLD.lec4.Test4.Validators.ValidatorCaseCadeFactory;

public class Client {

    public static void main(String[] args) {

        Address address = new Address();

        address.setZipCode("123456");
        address.setState("Rajasthan");
        address.setCity("Jaipur");

        System.out.println( ValidatorCaseCadeFactory.getInstance()
                            .getValidator("V1").validate(address));


    }

}
