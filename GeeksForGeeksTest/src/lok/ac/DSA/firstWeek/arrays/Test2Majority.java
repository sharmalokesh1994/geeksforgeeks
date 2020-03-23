package lok.ac.DSA.firstWeek.arrays;

/**
 * Created by Lokesh Sharma on 07-06-2019.
 */

/*

We hope you are familiar with using counter variables. Counting allows us to find how may times a certain element appears in an array or list.

You are given an array arr[] of size N. You are also given two elements x and y. Now, you need to tell which element (x or y) appears most in the array. In other words, print the element, x or y, that has highest frequency in the array. If both elements have the same frequency, then just print the smaller element.

 */
public class Test2Majority {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,5,5};

        System.out.println(new Test2Majority().majorityWins(arr,arr.length,4,5));
    }

    public int majorityWins(int arr[],int n,int x,int y)
    {
        int count_x=0;
        int count_y=0;


        for(int i=0;i<n;i++){
            if(arr[i]==x){
                count_x++;
            }else if(arr[i]==y){
                count_y++;
            }
        }

        if(count_x>count_y){
            return x;
        }else if(count_x<count_y){
            return y;
        }else {
            return Math.min(x,y);
        }
    }
}
