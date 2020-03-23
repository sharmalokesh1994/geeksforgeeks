package com.company;


public class Main {


    public static void main(String[] args) {


        int arr[]={1,2,3,4,6};

        int t = arr.length+2;

        boolean b = false;
        int n = arr.length;

        for(int i=0;i<n;i++){
            int t1 = arr[i]%t - 1;
            if(t1==n){
                b = true;
            }else{
                arr[t1] = arr[t1] + t;
            }

        }

        if(!b){
            System.out.println(n+1);
        }
        int ans = 0;

        for(int i=0;i<n;i++){

            if( arr[i]<t ){
                System.out.println(i+1);
                break;
            }

        }


        /*Object i = 4;

        System.out.println(i.getClass());

        Prac t = new Prac(4);

        method(t);*/

    }

    static void method(Test<?> val){
        System.out.println(val.getT().getClass() );
    }

}

class Test<T extends Number>{

    T t ;

    Test( T t ){
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
