package com.company.OOAD.Test4_Prototype_1;

import java.util.ArrayList;

class Vehicle implements Cloneable{

    ArrayList<String> list = null;

    Vehicle(){
        list = new ArrayList<>();
    }

    Vehicle(ArrayList<String> list){
        this.list = list;
    }

    public void addVehicle(String vehicle){
        list.add(vehicle);
    }
    public void createList(){
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        ArrayList<String> list = new ArrayList<>();

        for( String s: this.list ){
            list.add(s);
        }

        return new Vehicle(list);
    }
}

public class Prac1 {

    public static void main(String[] args) throws Exception{

        Vehicle v1 = new Vehicle();
        v1.createList();

        Vehicle v2 = (Vehicle) v1.clone();
    }

}
