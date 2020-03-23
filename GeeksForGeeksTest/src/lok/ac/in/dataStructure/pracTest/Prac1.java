package lok.ac.in.dataStructure.pracTest;

import java.util.Scanner;

/**
 * Created by Lokesh Sharma on 22-05-2019.
 */
public class Prac1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0; t<T; t++){

            int N = sc.nextInt();
            int arr[] = new int[N];

            for(int i =0 ; i<N; i++){
                arr[i] = sc.nextInt();
            }

            int minValue = 0;
            int maxValue = 0;
            int minPoint = 0;
            int maxPoint = 0;

            int i =0;
            for( ; i< N-1 ; i++){
                if(arr[i]>arr[i+1]){
                    minPoint = i;
                    minValue = arr[i+1];
                    maxValue = arr[i];
                    break;
                }
            }
            if(minPoint == 0 && minValue==0 && maxValue==0){
                System.out.printf("0 0");
            }else {
                for(int j =N-1 ;j>minPoint;j-- ){
                    if(arr[j]<arr[j-1]){
                        maxPoint = j;
                        if(minValue>arr[j]){
                            minValue = arr[j];
                        }
                        break;
                    }
                }

                int lastPoint = 0;
                for(int j=minPoint;j<maxPoint;j++){
                    if(minValue>arr[j]){
                        minValue = arr[j];
                    }
                    if(maxValue<= arr[j]){
                        maxValue = arr[j];
                        lastPoint = j;
                    }
                }


                for(int j=0;j<N;j++){
                    if(minValue<arr[j]){
                        minPoint = j;
                        break;
                    }
                }

                if(maxValue>arr[N-1]){
                    maxPoint = N-1;
                }else{
                    for(int j=lastPoint+1;j<N;j++){
                        if(maxValue<=arr[j]){
                            maxPoint = j-1;
                            break;
                        }
                    }
                }




                System.out.printf("%d %d",minPoint,maxPoint);

            }
            System.out.println();


        }
    }
}
