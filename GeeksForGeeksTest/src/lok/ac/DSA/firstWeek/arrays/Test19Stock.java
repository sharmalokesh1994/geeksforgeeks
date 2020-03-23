package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 09-06-2019.
 */
public class Test19Stock {


    public static void main(String[] args) {

        //int arr[] = {100,180,260,310,40,535,695};
        int arr[]={272,5};
        stockBuySell(arr,arr.length);
    }

    static void stockBuySell(int price[], int n) {

        // Your code here

        boolean bought = false;

        StringBuffer sb = new StringBuffer();

        for(int i=0;i<n-1;i++){
            if(!bought){
                if(price[i]<price[i+1]){
                    sb.append("("+i+" ");
                    bought=true;
                }

            }else {
                if(price[i]>price[i+1]){

                    sb.append(i+") ");

                    bought=false;
                }
            }
        }

        if(bought==true){

            sb.append((n-1)+")");


        }

        if(sb.toString().equals("")){
            System.out.print("No Profit");
        }else {
            System.out.print(sb);
        }



    }
}
