package lok.ac.DSA.firstWeek.mathMaticalTest;

/**
 * Created by Lokesh Sharma on 04-06-2019.
 */
public class Test2 {


    public static void main(String[] args) {
        Test2 test = new Test2();

        System.out.println(test.termOfGP(84,87,3));
    }

    public int digitsInFactorial(int N)
    {
        //Your code here

        double M_E = 2.71828182845904523536;
        double M_PI = 3.141592654;

        double x = (N * Math.log10(N / M_E) +
                Math.log10(2 * M_PI * N) /
                        2.0);
        return (int)Math.floor(x) + 1;
    }

    public double termOfGP(int A,int B,int N)
    {
        //Your code here

        double a = A;
        double b = B;

        double r = b/a;

        double ans = a*Math.pow(r,N-1);
        return ans;

    }

}
