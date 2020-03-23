package lok.ac.in.dataStructure.Search;

import java.util.Scanner;

/**
 * Created by Lokesh Sharma on 19-05-2019.
 * It will work on Sorted Array
 * It will not work on list
 */
public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t=0;t<T;t++){

            int N = sc.nextInt();
            int value = sc.nextInt();

            int arr[] = new int[N];
            for(int n=0;n<N;n++){
                arr[n] = sc.nextInt();
            }

            System.out.println(binarySearchFunc(arr,value,0,N));

        }

    }

    public static int binarySearchFunc(int arr[],int value,int l, int r){

        if(l>r){
            return -1;
        }

        int mid = (l+r)/2;

        if(arr[mid]==value){
           return 1;
        }
        else if(arr[mid]>value){
           return binarySearchFunc(arr,value,l,mid-1);
        }
        else {
            return binarySearchFunc(arr,value,mid+1,r);
        }

    }
}
