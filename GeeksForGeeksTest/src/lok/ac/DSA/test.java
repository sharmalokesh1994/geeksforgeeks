package lok.ac.DSA;

import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Lokesh Sharma on 23-06-2019.
 */
public class test {


}

class Author{

}



class HackerEarth extends Thread
{

    static CopyOnWriteArrayList hck = new CopyOnWriteArrayList();

    public void testhack()
    {
        hck.add("K");
    }

    public static void main(String[] args)
            throws InterruptedException
    {
        hck.add("H");
        hck.add("A");
        hck.add("C");
        HackerEarth t = new HackerEarth();
        t.testhack();

        Thread.sleep(1000);
        Iterator test1 = hck.iterator();
        while (test1.hasNext()) {
            String s = (String)test1.next();
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(hck);
    }
}


class example {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println(t);
    }
}