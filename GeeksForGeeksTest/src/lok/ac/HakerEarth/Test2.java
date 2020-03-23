package lok.ac.HakerEarth;

import java.util.Scanner;

/**
 * Created by Lokesh Sharma on 23-06-2019.
 */



/*

Sam among his friends wants to go to watch a movie in Armstord Cinema.
There is something special about Armstord cinema whenever people come in the group here. They will get seats accordingly their heights. Sam as a curious guy always wants to sit in the middle as cinema has the best view from the middle.
Now, Sam as the leader of his group decides who will join him for the movie.
Initially, he has  friends with him ( including him).
You are given  numbers that represent the heights of Sam's friends.
You are given the height of Sam as well.

Now, Sam can do two operations:
1. He can call a new friend of height .
2. He can cancel any of his friend invitations.

Each operation will cost him a unit time.
He wants to do this as soon as possible.
 */


public class Test2 {

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int S = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            int out = solve(arr, N,S);
            System.out.println(out);
        }
    }
    static int solve(int[] arr, int N,int S){
        // Please write your code here

        int left = 0;
        int right = 0;

        for(int i=0;i<N;i++){
            if(arr[i]<S){
                left++;
            }else {
                right++;
            }
        }

        return (int)Math.abs(right-left);

    }
}
