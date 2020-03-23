package com.company.OOPS.Test2_Encap.Test1;

// In encapsulation, we make variables private
// We provide getter and setter to access these variables
// By using encapsulation user will not know internal structure of the class

class A{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Test1 {

    public static void main(String[] args) {
        A a = new A();
        a.setName("Hello");
        System.out.println(a.getName());


    }

}
