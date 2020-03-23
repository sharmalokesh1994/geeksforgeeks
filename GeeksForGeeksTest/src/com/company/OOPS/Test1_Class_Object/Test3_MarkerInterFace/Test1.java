package com.company.OOPS.Test1_Class_Object.Test3_MarkerInterFace;

// Marker interface are used to mark something. Internally Marker Interface will always be empty.
interface Deleteable{

}

class A implements Deleteable{

}

class B{

}

public class Test1 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        delete(a);
        delete(b);

    }

    // Delete Entity from Database

    static void delete( Object obj){
        if( obj instanceof Deleteable ){
            System.out.println("Entity Deleted");
        }else{
            System.out.println("Entity can not be deleted");
        }
    }

}
