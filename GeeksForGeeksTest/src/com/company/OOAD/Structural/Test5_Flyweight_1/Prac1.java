package com.company.OOAD.Structural.Test5_Flyweight_1;

import javafx.scene.control.Skin;

import java.util.HashMap;
import java.util.Random;

interface Employee{

    void assignSkill(String skill);
    void task();
}


class Developer implements Employee{

    private String skill;
    private final String JOB;


    Developer(String job){
        this.JOB = job;
    }
    @Override
    public void assignSkill(String skill){
        this.skill = skill;
    }

    @Override
    public void task(){
        System.out.println(JOB + " of "+ skill);
    }
}

class Tester implements Employee{

    private String skill;
    private final String JOB;


    Tester(String job){
        this.JOB = job;
    }
    @Override
    public void assignSkill(String skill){
        this.skill = skill;
    }

    @Override
    public void task(){
        System.out.println(JOB + " of "+ skill);
    }
}

class EmployeeFactory{

    public static HashMap<String,Employee> hMap = new HashMap<>();

    public static Employee getEmployee( String type, String skill ){

        if(hMap.containsKey(type)){
            return hMap.get(type);
        }

        System.out.println("Creating new Object");

        Employee e = null;

        if( type.equals("Developer") ){
            e = new Developer("Fixing the issue");
            e.assignSkill(skill);
        }else {
            e = new Tester("Testing the issue");
            e.assignSkill(skill);
        }

        hMap.put(type,e);
        return e;

    }

}

public class Prac1 {

    private static String employeeType[] = {"Developer","Tester"};
    private static String skills[] = {"java",".net","c++","c"};

    public static void main(String[] args) {
        for( int i=0;i<10;i++ ){
            Employee e = EmployeeFactory.getEmployee(getEmployee(),getSkill());
            e.task();
        }
    }

    public static String getSkill(){
        Random r = new Random();
        int randInt = r.nextInt(skills.length);
        return skills[randInt];
    }

    public static String getEmployee(){
        Random r = new Random();
        int randInt = r.nextInt(employeeType.length);
        return employeeType[randInt];
    }

}
