package com.company.OOAD.Structural.Test6_Adapter_2;

enum BrowserType{
    CHROME,
    IE,
    FIREFOX;
}

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

class WebDriverAdapter implements WebDriver{


    private IEElement ie;
    WebDriverAdapter(IEElement ie){
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


class WebElementFactory{

    public static WebDriver getWebDriver( BrowserType type ){

        if(type.equals(BrowserType.CHROME)){
            return new ChromeElement();
        }else if( type.equals(BrowserType.IE) ){
            return new WebDriverAdapter(new IEElement());
        }
        return null;
    }

}

public class Prac1 {

    public static void main(String[] args) {

        WebDriver ieElement = WebElementFactory.getWebDriver(BrowserType.IE);

        ieElement.getElement();
        ieElement.selectElement();


        WebDriver chromeElement = WebElementFactory.getWebDriver(BrowserType.CHROME);

        chromeElement.getElement();
        chromeElement.selectElement();
    }

}