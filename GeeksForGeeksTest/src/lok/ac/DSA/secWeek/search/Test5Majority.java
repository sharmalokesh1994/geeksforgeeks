package lok.ac.DSA.secWeek.search;

/**
 * Created by Lokesh Sharma on 18-06-2019.
 */

/*
*****************************************************************
Majority Element
*****************************************************************
 */

/*
Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.
 */
public class Test5Majority {
    public static void main(String[] args) {

        int arr[] = {3,1,3,3,2};

        System.out.println(majorityElement(arr,arr.length));

    }

    static int majorityElement(int a[], int size)
    {
        // your code here

        int count =1;
        int element = a[0];
        for(int i=1;i<size;i++){
            if(a[i] == element){
                count++;
            }else {

                if(count<=0){
                    element=a[i];
                    count=0;
                }
                count--;
            }
        }

        int check=0;

        for(int i=0;i<size;i++){
            if(a[i]==element){
                check++;
            }
        }

        if(check>size/2){
            return element;
        }
        return -1;
    }
}
