package com.company.OOPS.Test1_Class_Object.Test2_ObjectCreation2;

public class Test1 {
    public static void main(String[] args) throws Exception {
        Test2 t1 = new Test2();
        Test2 t2 =  t1.clone();
        t2.method();
    }
}

// Cloneable is marker interface
// Marker Interface is an empty interface which will tell JVM that this class is cloneable or not

class Test2 implements Cloneable{

    void method(){
        System.out.println("Clonnable");
    }


    @Override
    protected Test2 clone()
            throws CloneNotSupportedException
    {
        return (Test2)super.clone();
    }

}
