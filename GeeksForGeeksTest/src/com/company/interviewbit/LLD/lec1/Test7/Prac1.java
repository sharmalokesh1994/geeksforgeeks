package com.company.interviewbit.LLD.lec1.Test7;

// Only one class should present one behaviour of the real world entity

enum Color{
    WHITE,
    BLACK,
    YELLOW,
    GREEN,
    PINK;

}

interface BirdInt{
    void fly();
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
class Hen extends Bird implements BirdInt{
    Color color;
    int price;

    public void fly( ){
        super.fly();
        System.out.println("Flying low");
    }

}

// This class will show the behaviour of Hen only
class Eagle extends Bird implements BirdInt{
    Color color;
    int price;

    public void fly( ){
        super.fly();
        System.out.println("Flying high");
    }

}


// This class will show the behaviour of Hen only
class Crow extends Bird implements BirdInt{
    Color color;
    int price;

    public void fly( ){
        super.fly();
        System.out.println("Flying med");
    }

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
