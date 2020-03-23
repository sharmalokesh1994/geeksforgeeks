package lok.ac.DSA.firstWeek.contest.first;

import java.util.Scanner;

/**
 * Created by Lokesh Sharma on 16-06-2019.
 */
public class Test3 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int T= sc.nextInt();

        StringBuffer sb = new StringBuffer();

        for(int t=0;t<T;t++){

            int n = sc.nextInt();

            int counter=0;

            while(n>1){



            int logValue = (int)(Math.log10(n)/Math.log10(2));

            int powOf2 = (int)Math.pow(2,logValue);



            if(n == powOf2){
                counter =counter+ logValue;
                break;
            }else{
                if(n-powOf2<=logValue){
                    counter =counter+ n-powOf2 + logValue;
                    break;
                }else if(2*powOf2-n<=logValue+1){
                    counter =counter+ 2*powOf2-n+logValue+1;
                    break;
                }
                else {
                    if(n%2==0){
                        n=n/2;
                        counter++;
                    }else{
                        n = n-1;
                        counter++;
                    }
                }
            }

        }

            //System.out.println(counter);

            sb.append(counter+"\n");

        }

        System.out.println(sb);

    }


}
