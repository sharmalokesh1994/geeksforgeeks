package lok.ac.DSA.secWeek.search;

/**
 * Created by Lokesh Sharma on 17-06-2019.
 */


/*
**********************************************************************
* Square root
* ********************************************************************
 */

/*
Given an integer x. The task is to find the square root of x. If x is not a perfect square, then return floor(√x).
 */

public class Test4SquareRoot {

    public static void main(String[] args) {

        Test4SquareRoot t = new Test4SquareRoot();
        System.out.println(t.floorSqrt(5));

    }

    long floorSqrt(long x)
    {
        // Your code here

        if(x==1){
            return 1;
        }

        long sqRoot = 2;
        long lastSqrt = 2;

        while(x>sqRoot*sqRoot){
            if(sqRoot*sqRoot==x){
                return sqRoot;
            }

            lastSqrt = sqRoot;
            sqRoot = sqRoot*sqRoot;

        }
        return sqRootValue(x,lastSqrt,sqRoot);
    }

    static long sqRootValue(long x, long lastSqrt,long sqRoot){

        if(sqRoot-lastSqrt<=1){
            return lastSqrt;
        }

        long mid = lastSqrt + (sqRoot-lastSqrt)/2;

        if(mid*mid==x){
            return mid;
        }
        if(mid*mid>x){
            return sqRootValue(x,lastSqrt,mid);
        }

        return sqRootValue(x,mid,sqRoot);
    }
}
