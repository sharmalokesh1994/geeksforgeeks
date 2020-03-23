package lok.ac.DSA.firstWeek.recursion;

/**
 * Created by Lokesh Sharma on 05-06-2019.
 */
public class Test2Jsohefi {

    public static void main(String[] args) {
        System.out.println(josephus(8,2));
    }

    static int josephus(int n, int k)
    {
       // int t;
        if (n == 1)
            return 1;
        else{
            int t = (josephus(n - 1, k) + k-1) % n + 1;
            return t;
        }

    }
}
