package lok.ac.DSA.secWeek.contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Lokesh Sharma on 29-06-2019.
 */
public class Test1 {

    public static void main (String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().trim());

        for(int t=0;t<T;t++){

            String nm[] = br.readLine().trim().split(" ");

            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);

            int mat[][] = new int[n][m];

            int arr[] = new int[n];

            for(int i=0;i<n;i++){

                String row[] = br.readLine().trim().split(" ");
                for(int j=0;j<m;j++){
                    int temp = Integer.parseInt(row[j]);
                    mat[i][j] = temp;

                    if(temp==1){
                        arr[i]=1;
                    }
                }

            }

            for(int i=0;i<n;i++){
                if(arr[i]==1){
                    for(int j=0;j<m;j++){
                        mat[i][j]=1;
                    }
                }
            }

            StringBuffer sb = new StringBuffer();

            for(int i=0;i<n;i++){

                for(int j=0;j<m;j++){
                    sb.append(mat[i][j]+" ");
                }

                if(i<n-1){
                    sb.append("\n");
                }

            }

            System.out.println(sb);

        }


    }

}
