package lok.ac.in.dataStructure.sorting;

/**
 * Created by Lokesh Sharma on 21-05-2019.
 */
public class MergeSort2 {

    public static void main(String[] args) {

        int arr[] = {38,27,43,3,9,82,10};
        divide(arr,0,arr.length-1);
        for(int a: arr){
            System.out.println(a);
        }
    }

    public static void divide(int arr[], int l, int r){
        if(l<r){
            int mid = l+(r-l)/2;
            divide(arr,l,mid);
            divide(arr, mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    public static void merge(int arr[], int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        int Larr[] = new int[n1];
        int Rarr[] = new int[n2];

        for(int i= 0;i<n1;i++){
            Larr[i] = arr[l+i];
        }

        for(int i =0; i<n2; i++){
            Rarr[i] = arr[mid+i+1];
        }

        int i =0,j=0, k=l;

        while(i<n1&&j<n2){
            if(Larr[i]<Rarr[j]){
                arr[k++] = Larr[i++];
            }else {
                arr[k++] = Rarr[j++];
            }
        }

        for(;i<n1;i++){
            arr[k++] = Larr[i];
        }
        for(;j<n2;j++){
            arr[k++] = Rarr[j];
        }

    }

}
