package com.company.interviewbit.LLD.lec4.Test4.Validators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ValidatorCaseCadeFactory {

    private static ValidatorCaseCadeFactory instance = new ValidatorCaseCadeFactory();

    private HashMap<String,Validator> validatorMap;

    private ValidatorCaseCadeFactory(){
        validatorMap = new HashMap<>();

        // These Groups will come
        // Group 1, These will come from Database
        List<Validator>  validatorList = new ArrayList<>();
        validatorList.add(new ZipCodeValidator());
        validatorList.add( new CityStateValidator() );
        validatorList.add(new StateValidator());
        validatorList.add(new CityStateValidator() );

        validatorMap.put("V1",new ValidatorCaseCade(validatorList));

        validatorList = new ArrayList<>();
        validatorList.add(new ZipCodeValidator());
        validatorList.add( new CityStateValidator() );
        validatorList.add(new StateValidator());
        validatorList.add(new CityStateValidator() );

        validatorMap.put("V2",new ValidatorCaseCade(validatorList));

        validatorList = new ArrayList<>();
        validatorList.add(new ZipCodeValidator());
        validatorList.add( new CityStateValidator() );
        validatorList.add(new StateValidator());
        validatorList.add(new CityStateValidator() );

        validatorMap.put("V3",new ValidatorCaseCade(validatorList));
    }

    public static ValidatorCaseCadeFactory getInstance(){
        return instance;
    }


    public Validator getValidator(String type){
        return validatorMap.get(type);
    }
}
