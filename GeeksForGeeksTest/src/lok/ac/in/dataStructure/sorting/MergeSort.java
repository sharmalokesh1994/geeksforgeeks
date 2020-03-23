package lok.ac.in.dataStructure.sorting;

/**
 * Created by Lokesh Sharma on 19-05-2019.
 */
public class MergeSort {


    public static void main(String[] args) {
        int arr[] = { 251,21,1,12,4,947, 119 };
        divide(arr,0,arr.length-1);

        for(int a : arr){
            System.out.println(a);
        }
    }

    static void divide(int arr[], int l, int r){
        if(l<r){
            int mid = l+(r-l)/2;
            divide(arr,l, mid);
            divide(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    static void merge(int arr[],int l, int m, int r){
        int i,j,k;
        int n1 = m-l+1;
        int n2 = r-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1+ j];

        i = 0; j=0; k = l;

        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

    /* Copy the remaining elements of L[], if there
       are any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

    /* Copy the remaining elements of R[], if there
       are any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }



}
