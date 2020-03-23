package lok.ac.in.dataStructure.dataStructure.linklist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Lokesh Sharma on 25-05-2019.
 */
public class LinkList<T> implements Iterable<T> {

    private Link<T> head = null;
    private Link<T> current = null;

    public LinkList(T t){
        current = new Link<>(t);
        head = current;
    }

    public void addValue(T t){
        current = head;
        while(current.next!=null){
            current = current.next;
        }

        current.next = new Link<T>(t);

        current = head;
    }

    public T getValue (int v){
        for(int i =0 ;i<v; i++){
            if(current==null){
                return null;
            }
            current = current.next;
        }

        return current.data;
    }

    @Override
    public Iterator<T> iterator() {

        return null;
    }

}

class Link<E>{

    Link<E> next;
    E data;

    public Link(E d){
        this.data = d;
        this.next=null;
    }
}

class Test{
    public static void main(String[] args) {
        LinkList<String> l1 = new LinkList<>("a");

        l1.addValue("L");

        l1.addValue("O");
        l1.addValue("K");

        System.out.println(l1.getValue(1));



    }
}
