package com.company.interviewbit.LLD.lec1.Test6;

// Only one class should present one behaviour of the real world entity

enum Color{
    WHITE,
    BLACK,
    YELLOW,
    GREEN,
    PINK;

}


// blueprint of real-world entity Bird
class Bird{

    // States (property)
    Color color;
    int price;

    // Actions = Behaviour
    void fly( ){
        System.out.println("Open Wings");
    }

}

// This class will show the behaviour of Hen only
class Hen extends Bird{
    Color color;
    int price;

    void fly( ){
        super.fly();
        System.out.println("Flying low");
    }

}

// This class will show the behaviour of Hen only
class Eagle extends Bird{
    Color color;
    int price;

    void fly( ){
        super.fly();
        System.out.println("Flying high");
    }

}


// This class will show the behaviour of Hen only
class Crow extends Bird{
    Color color;
    int price;

    // Here User forget to implement fly method
    // it will not throw any exception as well. So that it will be called Silent Killer
    // To remove this we will use interface here

}

public class Prac1 {

    public static void main(String[] args) {

        Hen hen = new Hen();
        Eagle eagle = new Eagle();
        // now hen will fly like hen
        hen.fly();
        //eagle will fly like eagle
        eagle.fly();

        //not correct
        Crow crow = new Crow();
        crow.fly();

    }

}
