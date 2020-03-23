package lok.ac.DSA.firstWeek.contest.first;

import java.util.Scanner;

/**
 * Created by Lokesh Sharma on 16-06-2019.
 */


/*
************************************************************************
* Nearest Perfect Square
* **********************************************************************
 */


/*
You are given a number N. You need to find the perfect square that is nearest to it. If two perfect squares are at the same distance to N, then print the greater perfect square.
 */

public class Test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        StringBuffer sb = new StringBuffer();

        for(int t=0;t<T;t++){
            long n = sc.nextLong();


            long temp = (long)Math.sqrt(n);

            long tempSq = temp*temp;

            if(tempSq==n){
                 sb.append((temp-1)*(temp-1));
            }

            else {
                long tempSq1 = (temp+1)*(temp+1);

                long dis = n - tempSq;

                if(dis >= (tempSq1-n)){
                    sb.append(tempSq1);

                }else {
                    sb.append(tempSq);
                }



            }




            sb.append("\n");
        }

        System.out.print(sb.toString());

    }

    static long nearSquare(long n){
        long temp = (long)Math.sqrt(n);

        long tempSq = temp*temp;

        if(tempSq==n){
            return (temp-1)*(temp-1);
        }

            long tempSq1 = (temp+1)*(temp+1);

            long dis = n - tempSq;

            if(dis >= (tempSq1-n)){
                return tempSq1;

            }

            return tempSq;

    }


}
