package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 09-06-2019.
 */
public class Test22Kadane {

    public static void main(String[] args) {
        //int arr[] = {1,2,3,-2,5};

        //int arr[]={8,-8,9,-9,10,-11,12};

        int arr[] = {10,-3,-4,7,6,5,-4,-1};

        System.out.println(circularSubarraySum(arr,arr.length));
    }


    static int circularSubarraySum(int arr[], int n) {

        // Your code here

        int t = maxSubarraySum(arr,n);

        int arr2[] = new int[n];

        int lastPoint = 0;

        for(int i=n-1;i>=0;i--){
            if(arr[i]<0){
                lastPoint=i;
                break;
            }
        }

        int i=0;
        for(int j=lastPoint+1;j<n;j++){
            arr2[i]=arr[j];
            i++;
        }
        int j=0;
        for(;i<n;i++){
            arr2[i]=arr[j];
            j++;
        }

        int t2 = maxSubarraySum(arr2,n);

        return (int)Math.max(t,t2);

    }

    static int maxSubarraySum(int arr[], int n){

        // Your code here

        int sum[]=new int[n];



        sum[0]=arr[0];

        for(int i=1;i<n;i++){
            if(sum[i-1]<0){
                sum[i]=arr[i];
            }else {
                sum[i]=sum[i-1]+arr[i];
            }
        }

        int max=sum[0];

        for(int i=0;i<n;i++){
            if(max<sum[i]){
                max=sum[i];
            }
        }

        return max;
    }
}
