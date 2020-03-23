package com.company.OOAD.Structural.Test6_Adapter_1;

interface WebDriver{
    void getElement();
    void selectElement();
}

class ChromeElement implements WebDriver{

    @Override
    public void getElement() {
        System.out.println("Chrome Driver get Element");
    }

    @Override
    public void selectElement() {
        System.out.println("Chrome Driver select Element");
    }
}

class IEElement{


    public void findElement() {
        System.out.println("IE Driver find Element");
    }


    public void clickElement() {
        System.out.println("IE Driver click Element");
    }
}

class WebDriverAdapter implements WebDriver {


    private IEElement ie;

    WebDriverAdapter(IEElement ie) {
        this.ie = ie;
    }

    @Override
    public void getElement() {
        ie.findElement();
    }

    @Override
    public void selectElement() {
        ie.clickElement();
    }
}

public class Prac1 {

    public static void main(String[] args) {

        WebDriver ieElement = new WebDriverAdapter(new IEElement());

        ieElement.getElement();
        ieElement.selectElement();
    }

}
