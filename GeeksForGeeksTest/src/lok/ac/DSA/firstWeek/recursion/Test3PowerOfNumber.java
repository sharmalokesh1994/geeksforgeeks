package lok.ac.DSA.firstWeek.recursion;

/**
 * Created by Lokesh Sharma on 05-06-2019.
 */

/*
Given a number N, let the reverse of the number be R. The task is to print the output of the Expression power(N,R), where pow function represents N raised to power R.
Note: As answers can be very large, print the result modulo 1000000007.
 */
public class Test3PowerOfNumber {

    public static void main(String[] args) {
        Test3PowerOfNumber t = new Test3PowerOfNumber();
        System.out.println(t.power(9767,7679));
    }

    int power(int N,int R)
    {
        //Your code here

        if(R==0){
            return 1;
        }

        long t =  (long)((long)(N%1000000007)*(long)(power(N,R-1)%1000000007))%1000000007;

//        if(t<0){
//            t = (t+1000000007)%1000000007;
//        }
        return (int)t;
    }
}
