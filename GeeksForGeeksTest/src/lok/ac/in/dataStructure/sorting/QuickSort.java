package lok.ac.in.dataStructure.sorting;

/**
 * Created by Lokesh Sharma on 22-05-2019.
 */
public class QuickSort {

    public static void main(String[] args) {

        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        sort(arr,0,n-1);

        printArray(arr);

    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void sort(int arr[], int low, int high){
        if(low<high){

            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr,pi+1,high);

        }
    }

    public static int partition(int arr[], int low, int high){

        int i = low-1;

        int pi = arr[high];

        for(int j=low;j<high;j++){

            if(arr[j]<=pi){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        arr[high] = arr[i];
        arr[i] = pi;

        return i;
    }
}
