package com.company.DSA;

public class test {

    public static void main(String[] args) {
        Counter a = new Counter(0);

        check(5,a);
    }

    public static void check(int n,Counter a){
        if(n<0){
            return ;
        }

        n--;
        check(n,a);
        System.out.println(a.count);
        a.increaseByOne();

    }


}


class Counter {

    int count = 0;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    public void increaseByOne() {
        count++;
    }
}

