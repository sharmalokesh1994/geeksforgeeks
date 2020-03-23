package com.company.OOPS.Test4_Association.Test1;

// Teacher and student are both independant
// if one leaves school not impact to other
// Due to week relation it is called Association

class Teacher{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student{
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

        Teacher t1 = new Teacher();
        t1.setName("Ram");

        Student s1 = new Student();
        s1.setName("Shyam");

    }

}
