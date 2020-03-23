package lok.ac.DSA.firstWeek.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Lokesh Sharma on 08-06-2019.
 */
public class Test17MaxDifference {


    public static void main(String[] args) throws Exception{
        //int arr[] = {34,8,10,3,2,80,30,33,1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim()); // size of array
        int arr[] = new int[n];
        String inputLine[] = br.readLine().trim().split(" ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
        }

        System.out.println(maxIndexDiff(arr,arr.length));
    }

    static int maxIndexDiff(int arr[], int n) {

        // Your code here

        int arrLeft[] = new int[n];

        int arrRight[] = new int[n];

        int maxR=arr[n-1];
        int minL=arr[0];

        for(int i=n-1;i>=0;i--){
            if(arr[i]>maxR){
                maxR=arr[i];
            }
            arrRight[i]=maxR;
        }

        for(int i = 0; i<n;i++){
            if(arr[i]<minL){
                minL = arr[i];
            }
            arrLeft[i]=minL;
        }

        int minValue=0;
        int maxValue=0;

        int minValue1=0;
        int maxValue1=0;

        for(int i =0 ;i<n;i++){
            if(arrLeft[i]<=arrRight[n-i-1]){
                minValue=arrLeft[i];
                maxValue=arrRight[n-i-1];
                break;
            }
        }


        for(int i=0;i<n;i++){
            if(arrLeft[i]<=maxValue){
                minValue1 = arrLeft[i];
                break;
            }
        }

        for(int i = n-1;i>=0;i--){
            if(arrRight[i]>=minValue1){
                maxValue1=arrRight[i];
                break;
            }
        }

        for(int i = n-1;i>=0;i--){
            if(arrRight[i]>=minValue){
                maxValue=arrRight[i];
                break;
            }
        }

        int indexMinValue=0;
        int indexMaxValue=0;

        for(int i=0;i<n;i++){
            if(arr[i]==minValue){
                indexMinValue=i;
                break;
            }
        }

        for(int i=n-1;i>=0;i--){
            if(arr[i]==maxValue){
                indexMaxValue=i;
                break;
            }
        }

        int indexMinValue1=0;
        int indexMaxValue1=0;

        for(int i=0;i<n;i++){
            if(arr[i]==minValue1){
                indexMinValue1=i;
                break;
            }
        }

        for(int i=n-1;i>=0;i--){
            if(arr[i]==maxValue1){
                indexMaxValue1=i;
                break;
            }
        }

        int temp = indexMaxValue-indexMinValue;

        int temp2 = indexMaxValue1-indexMinValue1;
        return (int)Math.max(temp,temp2);
    }
}
