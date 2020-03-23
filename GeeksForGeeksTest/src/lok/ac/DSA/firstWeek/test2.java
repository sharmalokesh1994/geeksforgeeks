package lok.ac.DSA.firstWeek;

/**
 * Created by Lokesh Sharma on 05-06-2019.
 */
public class test2 {

    public static void main(String[] args) {
        test2 t = new test2();
        t.printNos(5);
    }

    public void printNos(int N)
    {
        //Your code here

        if(N<1){
            return;
        }
        printNos(N-1);
        System.out.println(N);
    }
}
