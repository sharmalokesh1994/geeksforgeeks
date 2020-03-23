package lok.ac.DSA.firstWeek.mathMaticalTest;

/**
 * Created by Lokesh Sharma on 04-06-2019.
 */
public class Test5Modular {
    public static void main(String[] args) {

        Test5Modular test = new Test5Modular();

        System.out.println(test.modInverse(3,11));

    }
    public int modInverse(int a, int m)
    {
        //Your code here

        if(gcd(a,m)!=1){
            return -1;
        }
        for(int i=1; i<a;i++){
            if((m*i+1)%a==0){
                return (m*i+1)/a;
            }
        }

        return -1;
    }

    public int gcd(int a, int m){
        if(a%m==0){
            return m;
        }
        if(m%a == 0){
            return a;
        }

        int b;
        if(a>m){
            b = a%m;
            return gcd(b,m);
        }else{
            b = m%a;
            return gcd(a,b);
        }
    }
}
