package lok.ac.DSA.firstWeek.mathMaticalTest;

/**
 * Created by Lokesh Sharma on 04-06-2019.
 */

// checking the Number is prime or not
public class Primality {

    public static void main(String[] args) {
        Primality p =new Primality();

        System.out.println(p.isPrime(11));
    }

    public boolean isPrime(int N)
    {
        //Your code here

        if(N==2 || N==3 || N==5 || N==7){
            return true;
        }
        if(((N-1)%6==0 )|| (N+1)%6==0){
            for(int i=5;i*i<=N;i=i+6){
                if(N%i==0 || N%(i+2)==0){
                    return false;
                }
            }

            return true;

        }

        return false;
    }
}
