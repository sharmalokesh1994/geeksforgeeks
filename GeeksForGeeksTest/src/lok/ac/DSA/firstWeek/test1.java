package lok.ac.DSA.firstWeek;

import java.util.Scanner;

/**
 * Created by Lokesh Sharma on 04-06-2019.
 */
public class test1 {

    public static void main(String[] args) {
        test1 test = new test1();

        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();
        while(T-->0)
        {

            int N;
            N=sc.nextInt();
            int a[]=new int [N];
            for(int i=0;i<N;i++)
            {
                int x=sc.nextInt();
                a[i]=x;
            }


            System.out.println(test.mean(a,N));


        }


    }

    public int mean(int A[],int N)
    {
        //Your code here

        int sum = 0;

        for(int a : A){
            sum = sum+a;
        }

        return (int) Math.floor(sum/N);

    }


    public int modInverse(int a, int m)
    {
        //Your code here

        if(a%m==0){
            return -1;
        }else if(a%2==0 && m%2==0){
            return -1;
        }

        int n=1;



        return -1;
    }

}
