package lok.ac.in;

public class Main {



    public static void main(String[] args) {
	// write your code here



    }


    void merge(int arr[], int l, int m, int r)
    {
        // Your code here

        int n1 = m-l+1;
        int n2 = r-m;
        int L[] = new int[n1];
        int U[] = new int[n2];

        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }

        for(int i=0;i<n2;i++){
            U[i]=arr[m+i+1];
        }

        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(L[i]<U[j]){
                arr[k]=L[i];
                i++;
            }
            else if(L[i]>U[j]){
                arr[k] = U[j];
                j++;
            }
            k++;
        }

        for(;i<n1;i++){
            arr[k]=L[i];
            k++;
        }

        for(;j<n1;j++){
            arr[k]=U[j];
            k++;
        }



    }
}




class GfG
{

    void merge(int arr[], int l, int m, int r)
    {
        int n1 = m-l+1;
        int n2 = r-m;
        int L[] = new int[n1];
        int U[] = new int[n2];

        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }

        for(int i=0;i<n2;i++){
            U[i]=arr[m+i+1];
        }

        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(L[i]<U[j]){
                arr[k]=L[i];
                i++;
            }
            else if(L[i]>U[j]){
                arr[k] = U[j];
                j++;
            }
            k++;
        }

        for(;i<n1;i++){
            arr[k]=L[i];
            k++;
        }

        for(;j<n2;j++){
            arr[k]=U[j];
            k++;
        }



    }

}
