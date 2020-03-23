package lok.ac.DSA.firstWeek.recursion;

/**
 * Created by Lokesh Sharma on 06-06-2019.
 */
public class Test5PhoneDigit {

    public static void main(String[] args) {

        int a[] = {7,4,2,9,4};
        possibleWords(a,5);
    }

    static void possibleWords(int a[], int N)
    {
        // your code here

        possibleWords(a,"",N);

    }

    static void possibleWords(int a[],String s, int N){

        if(N==0){

            System.out.print(s+" ");
            return;
//            int first = 97+(a[N-1]-2)*3;
//            System.out.print((char)first);
//            System.out.print(" ");
//
//            System.out.print((char)(first+1));
//            return;
        }

        int t = a.length-N;


        if(a[t]>=2&& a[t]<=6){
            int first = 97+(a[t]-2)*3;
            String s1 = s+(char)first;
            possibleWords(a,s1,N-1);
            s1 = s+(char)(first+1);
            possibleWords(a,s1,N-1);
            s1 = s+(char)(first+2);
            possibleWords(a,s1,N-1);
        }else if(a[t]==7){
            int first = 112;
            String s1 = s+(char)first;
            possibleWords(a,s1,N-1);
            s1 = s+(char)(first+1);
            possibleWords(a,s1,N-1);
            s1 = s+(char)(first+2);
            possibleWords(a,s1,N-1);
            s1 = s+(char)(first+3);
            possibleWords(a,s1,N-1);
        }else if(a[t]==8){
            int first = 116;
            String s1 = s+(char)first;
            possibleWords(a,s1,N-1);
            s1 = s+(char)(first+1);
            possibleWords(a,s1,N-1);
            s1 = s+(char)(first+2);
            possibleWords(a,s1,N-1);
        }else {
            int first = 119;
            String s1 = s+(char)first;
            possibleWords(a,s1,N-1);
            s1 = s+(char)(first+1);
            possibleWords(a,s1,N-1);
            s1 = s+(char)(first+2);
            possibleWords(a,s1,N-1);
            s1 = s+(char)(first+3);
            possibleWords(a,s1,N-1);
        }

    }
}