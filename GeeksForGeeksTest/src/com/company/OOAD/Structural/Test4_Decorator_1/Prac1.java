package com.company.OOAD.Structural.Test4_Decorator_1;

// Modification at runtime
interface Dress{
    void assemble();
}

class BasicDress implements Dress{

    @Override
    public void assemble(){
        System.out.println("Assembled Basic dress");
    }
}

class DressDecorator implements Dress{

    Dress dress;

    // It will add compulsory constructor
    DressDecorator(Dress dress){
        this.dress = dress;
    }

    @Override
    public void assemble(){
        dress.assemble();
    }
}

class FancyDress extends DressDecorator{

    FancyDress(Dress dress){
        super(dress);
    }

    @Override
    public void assemble(){
        System.out.println("Fancy Dress Assembled");
        super.assemble();
    }

}

class CasualDress extends DressDecorator{

    CasualDress(Dress dress){
        super(dress);
    }

    @Override
    public void assemble(){
        System.out.println("Casual Dress Assembled");
        super.assemble();
    }

}

class SportyDress extends DressDecorator{

    SportyDress(Dress dress){
        super(dress);
    }

    @Override
    public void assemble(){
        System.out.println("Sporty Dress Assembled");
        super.assemble();
    }

}

public class Prac1 {

    public static void main(String[] args) {

        SportyDress dress = new SportyDress(new BasicDress());

        dress.assemble();

        FancyDress dress1 = new FancyDress(new BasicDress());

        dress1.assemble();

        FancyDress dress2 = new FancyDress(new CasualDress(new BasicDress()));

        dress2.assemble();

    }

}
