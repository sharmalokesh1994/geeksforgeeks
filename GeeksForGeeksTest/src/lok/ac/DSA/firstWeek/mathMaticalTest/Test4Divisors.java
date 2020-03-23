package lok.ac.DSA.firstWeek.mathMaticalTest;

/**
 * Created by Lokesh Sharma on 04-06-2019.
 */


/*
Question

Given a positive integer value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.
 */
public class Test4Divisors {

    public static void main(String[] args) {
        Test4Divisors test = new Test4Divisors();

        System.out.println(test.exactly3Divisors(999999));
    }

    public int exactly3Divisors(int N)
    {
        //Your code here

        int temp = (int)Math.sqrt(N);

        int count=0;


        if(temp >=3){
            count =2;
        }else if(temp >=2){
            count = 1;
        }

        for(int i =5;i<=temp;i=i+6){
            if(isPrime(i)){
                count++;
            }
            if(i+2>temp){
                break;
            }
            if(isPrime(i+2)){
                count++;
            }
        }

        return count;
    }

    public boolean isPrime(int N){

        if(N==2 || N==3 || N==5 || N==7){
            return true;
        }

        for(int i =5;i*i<=N;i=i+6){
            if(N%i==0 || N%(i+2)==0){
                return false;
            }

        }
        return true;
    }
}
