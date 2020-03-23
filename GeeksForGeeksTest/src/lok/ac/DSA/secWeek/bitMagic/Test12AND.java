package lok.ac.DSA.secWeek.bitMagic;

/**
 * Created by Lokesh Sharma on 12-06-2019.
 */
public class Test12AND {

    public static void main(String[] args) {

        int arr[] = {4,8,2,16};
        System.out.println(maxAND(arr,arr.length));

    }

    public static int maxAND (int arr[], int n) {

        // Your code here
        // You can add extra function (if required)

        if(n==1){
            return 0;
        }

        int a = 0x40000000;
        int counter =0;

        int arrNew[] = new int[n];

        for(int i=0;i<32;i++){
            for(int j=0;j<n;j++){
                if((arr[j] & a)>0){
                    arrNew[counter] = arr[j];
                    counter++;
                }
            }

            a = a>>1;
            if(counter==2){
                break;
            }
            else if(counter>2){
                arr = arrNew;

            }
            counter=0;

        }

        return arrNew[0] & arrNew[1];
    }
}
