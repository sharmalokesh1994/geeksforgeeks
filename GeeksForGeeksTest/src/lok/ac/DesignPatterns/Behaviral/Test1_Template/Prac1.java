package lok.ac.DesignPatterns.Behaviral.Test1_Template;


// In template design Pattern we will create a template for all the Designs
abstract class HouseTemplate{

    public final void buildHouse(){

        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is completely build");
    }

    public void buildFoundation(){
        System.out.println("make Strong Foundation");
    }

    abstract public void buildPillars();
    abstract public void buildWalls();

    public void buildWindows(){
        System.out.println("make Windows");
    }


}

class WoodenHouse extends HouseTemplate{

    @Override
    public void buildPillars() {
        System.out.println("build wooden Pillars");
    }

    @Override
    public void buildWalls() {
        System.out.println("build wooden walls");
    }

}

class GlassHouse extends HouseTemplate{

    @Override
    public void buildPillars() {
        System.out.println("build glass Pillars");
    }

    @Override
    public void buildWalls() {
        System.out.println("build glass walls");
    }
}

public class Prac1 {

    public static void main(String[] args) {

        HouseTemplate woodenHouse = new WoodenHouse();
        HouseTemplate glassHouse = new GlassHouse();
        woodenHouse.buildHouse();
        glassHouse.buildHouse();

    }

}
