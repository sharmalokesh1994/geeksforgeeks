package com.company.OOAD.SOLID.Test1_SRP.Test2;

class Circle {

    int rad;
    Circle(int rad){
        this.rad = rad;
    }

}

class Square{

    int length;
    Square( int length ){
        this.length = length;
    }

}


// Stateless class
class AreaCalculator{

    static final double PI = 3.14;

    // if there will be more classes
    // So we have to modify this class as well
    // but ideally the code should expendable without any much changes

    // it is against SRP as well
    static int area( Object SqShape ){
        if( SqShape instanceof Circle ){
            return (int)PI*((Circle) SqShape).rad*((Circle) SqShape).rad;
        }else{
            return ( (Square) SqShape ).length * ( (Square) SqShape ).length;
        }
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
