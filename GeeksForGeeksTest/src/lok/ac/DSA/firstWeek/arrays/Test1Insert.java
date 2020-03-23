package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 07-06-2019.
 */

/*
Insertion is a basic but frequently used operation. Arrays in most languages cannnot be dynamically shrinked or expanded. Here, we will work with such arrays and try to insert an element at some index.

You are given an array arr. The size of the array is given by sizeOfArray. You need to insert an element at given index and print the modified array.
 */
public class Test1Insert {

    public static void main(String[] args) {
        int arr[]=new int[6];
        for(int i=1;i<=5;i++){
            arr[i-1]=i;
        }

        Test1Insert t = new Test1Insert();
        t.insertAtIndex(arr,6,2,90);

        for(int a:arr){
            System.out.println(a);
        }
    }

    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        //Your code here, Geeks

        if(sizeOfArray-1==index){
            arr[index] = element;
            return;
        }

        int temp = arr[index];
        arr[index] = element;

        index++;

        insertAtIndex(arr,sizeOfArray,index,temp);

    }
}
