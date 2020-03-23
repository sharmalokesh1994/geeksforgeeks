package com.company.OOPS.FINAL.Test2_ImmutableClass;

final class Student{

    final private String name;
    final private int Roll_no;

    Student( String name, int Roll_no ){
        this.name=name;
        this.Roll_no = Roll_no;

    }

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return Roll_no;
    }
}

public class Test1 {

    public static void main(String[] args) {
        Student s1 = new Student("Name",1);

        System.out.println(s1.getName());

    }
}
