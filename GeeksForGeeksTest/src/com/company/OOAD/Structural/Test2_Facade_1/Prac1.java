package com.company.OOAD.Structural.Test2_Facade_1;


import java.sql.Driver;

class ChromeDriver{

    public static Driver getDreiver(){
        return null;
    }

    public static void getHTML(Driver driver){
        System.out.println("Chrome HTML Data");
    }

    public static void getJUNITResult(Driver driver){
        System.out.println("Chrome Junit Result");
    }

}


class FireFOXDriver{

    public static Driver getDreiver(){
        return null;
    }

    public static void getHTML(Driver driver){
        System.out.println("Firefox HTML Data");
    }

    public static void getJUNITResult(Driver driver){
        System.out.println("Firefox Junit Result");
    }

}

class BrowserFacade{


    public static void generateReport(String explorer, String test){

        if(explorer.equals("Chrome")){
            Driver driver = FireFOXDriver.getDreiver();

            if(test.equals("html")){
                ChromeDriver.getHTML(driver);
            }else if( test.equals("junit") ){
                ChromeDriver.getJUNITResult(driver);
            }
        }else if(explorer.equals("Firefox")){
            Driver driver = FireFOXDriver.getDreiver();

            if(test.equals("html")){
                FireFOXDriver.getHTML(driver);
            }else if( test.equals("junit") ){
                FireFOXDriver.getJUNITResult(driver);
            }
        }
    }

}

public class Prac1 {

    public static void main(String[] args) {

        BrowserFacade.generateReport("Chrome","junit");
        BrowserFacade.generateReport("Firefox","junit");

        BrowserFacade.generateReport("Chrome","html");
        BrowserFacade.generateReport("Firefox","html");

    }
}
