package lok.ac.DSA.firstWeek.recursion;

import java.util.Arrays;

/**
 * Created by Lokesh Sharma on 06-06-2019.
 */

/*
Given a string S. The task is to print all permutations of a given string.
 */
public class Test4Permutation {

    public static void main(String[] args) {
        Test4Permutation t = new Test4Permutation();

        t.permutation("ABC");
    }


    public String sortString(String inputString){
        char inputChar[] = inputString.toCharArray();
        Arrays.sort(inputChar);

        return (new String(inputChar));
    }

    public void permutation(String S)
    {
        S = sortString(sortString(S));
        printString(S,S.length());
    }

    public void printString(String s, int n){
        if(n==1){
            System.out.print(s+" ");
            return;
        }


        String sub = sortString(s.substring(s.length()-n));

        s = s.substring(0,s.length()-n)+sub;

        int len = s.length();

        for(int i=len-n; i<len;i++){
            String t = swapChar(s,len-n,i);
            printString(t,n-1);
        }


    }

    public String swapChar(String str, int i, int j){
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

        String s = new String(ch);


        return s;

    }

}
