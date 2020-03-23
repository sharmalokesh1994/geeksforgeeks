package lok.ac.in.dataStructure.old_concepts;

/**
 * Created by Lokesh Sharma on 25-05-2019.
 */
public class Generics <T> {

    T obj;

    void add(T obj){this.obj=obj;}

    T get(){return obj;}

}


class Test{
    public static void main(String[] args) {
        Generics<Integer> g = new Generics<>();

        g.add(5);

        System.out.println(g.get());
    }
}
