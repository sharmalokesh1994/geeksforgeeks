package com.company.OOPS.Test1_Class_Object.Test2_ObjectCreation1;

public class Test1 {

    //2. Object Creation using Reflection API

    public static void main(String[] args) {
        try {
            Test1 t = (Test1) Class.forName("com.company.OOPS.Test1_Class_Object.Test2_ObjectCreation1.Test1").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
