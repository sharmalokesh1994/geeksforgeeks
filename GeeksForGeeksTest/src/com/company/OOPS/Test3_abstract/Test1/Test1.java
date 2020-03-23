package com.company.OOPS.Test3_abstract.Test1;

// We can not create object of abstract class but we can create anonymous class
abstract class Shape{

    // To access a in anonymous class we have to create a local variable
    int a;
    Shape(int a){
        this.a =a;
    }
    abstract int area();

}

class Square extends Shape{
    int a;
    Square(int a){
        super(a);
        this.a=a;
    }

    @Override
    int area() {
        return a*a;
    }
}

class Rect extends Shape{
    int a;
    int b;
    Rect(int a,int b){
        super(0);
        this.a=a;
        this.b=b;
    }

    @Override
    int area() {
        return a*b;
    }
}

public class Test1 {

    public static void main(String[] args) {
        Shape s1 = new Square(10);
        Shape s2 = new Rect(10,20);
        Shape s3 = new Shape(10){

            @Override
            int area() {
                return a*a;
            }
        };


        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());

    }

}
