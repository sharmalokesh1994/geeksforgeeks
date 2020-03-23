package lok.ac.DSA.firstWeek.mathMaticalTest;

/**
 * Created by Lokesh Sharma on 04-06-2019.
 */


// find root of the Quardatic equation
public class Test1 {
    public static void main(String[] args) {

        Test1 test = new Test1();
        test.quadraticRoots(752,904,164);
    }

    public void quadraticRoots(int a,int b,int c)
    {
        //Your code here

        if(a==0){
            System.out.print("Invalid");
            return;
        }

        int checkNumber = b*b-4*a*c;

        if(checkNumber<0){
            System.out.print("Imaginary");
            return;
        }

        double root1 = ((-b+Math.sqrt(checkNumber))/(2*a));
        double root2 = ((-b-Math.sqrt(checkNumber))/(2*a));

        if(root1>root2){
            System.out.print((int)Math.floor(root1)+" "+(int)Math.floor(root2));
        }else {
            System.out.print((int)Math.floor(root2)+" "+(int)Math.floor(root1));
        }


    }
}
