package com.company.OOAD.SOLID.Test2_OPEN_CLOSE.Test1;

interface Shape{
    double PI = 3.14;
    int area();
}

class Circle implements Shape{

    int rad;
    Circle(int rad){
        this.rad = rad;
    }

    @Override
    public int area(){
        return (int)PI*rad*rad;
    }

}

class Square implements Shape{

    int length;
    Square( int length ){
        this.length = length;
    }

    @Override
    public int area(){
        return (int)length*length;
    }

}


// Stateless class
class AreaCalculator{


    static int area( Shape shape ){
        return shape.area();
    }

}

class PrintValue{
    // class is following SRP rule
    static void printValue( String form, int value){

        System.out.println(form+" "+value);

    }
}

public class Prac1 {

    public static void main(String[] args) {

        Circle circle = new Circle(5);

        int t1 = AreaCalculator.area(circle);
        PrintValue.printValue("Form 1 output: ",t1);

    }

}
