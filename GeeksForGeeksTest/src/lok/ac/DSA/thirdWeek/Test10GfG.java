package lok.ac.DSA.thirdWeek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Lokesh Sharma on 22-06-2019.
 */
public class Test10GfG {

    public static void main(String[] args) throws Exception{

        BufferedReader read= new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(read.readLine());
        ArrayList<Integer> A=new ArrayList<>();
        ArrayList<Integer> B=new ArrayList<>();


        String str[] = read.readLine().trim().split(" ");
        for(int i=0;i<N;i++)
        {
            int val = Integer.parseInt(str[i]);
            A.add(i,val);
        }

        str = read.readLine().trim().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        B = new Test10GfG().threeWayPartition(A,n,m);
        System.out.println("Done");


    }

    public ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int a, int b)
    {
        //add code here.

        int sizeOfList = A.size();

        int l = 0;
        int r = 0;

        while(r<sizeOfList){
            if(A.get(r)<a){
                int temp = A.get(r);
                A.set(r,A.get(l));
                A.set(l,temp);
                l++;
            }
            r++;
        }


        l = 0;
        r = 0;

        while(r<sizeOfList){
            if(A.get(r)<b){
                int temp = A.get(r);
                A.set(r,A.get(l));
                A.set(l,temp);
                l++;
            }
            r++;
        }


        return A;
    }
}
