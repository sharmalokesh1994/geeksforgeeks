package lok.ac.DSA.secWeek.contest;

import java.util.Scanner;

/**
 * Created by Lokesh Sharma on 29-06-2019.
 */
public class Test2 {

    public static void main (String[] args) {
        //code

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0;t<T;t++){



            int N = sc.nextInt();

            if(N==1){
                System.out.println(0);
            }else if(N==2){
                System.out.println(1);
            }else{
                int temp = (int)(Math.log10(N)/Math.log10(2));
                int xorValue=0;
                if(temp%2==0){
                    int temp2 = temp/2;
                    xorValue = (int)Math.pow(2,temp2);

                    N = N^xorValue;
                }else {
                    int temp2 = temp/2;
                    xorValue = (int)Math.pow(2,temp2);

                    N = N^xorValue;

                    xorValue = (int)Math.pow(2,temp2+1);

                    N = N^xorValue;
                }
                System.out.println(N);
            }

        }

    }
}
