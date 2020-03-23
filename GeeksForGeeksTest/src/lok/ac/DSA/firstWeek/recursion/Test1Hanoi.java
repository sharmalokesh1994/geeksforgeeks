package lok.ac.DSA.firstWeek.recursion;

/**
 * Created by Lokesh Sharma on 05-06-2019.
 */

/*
Tower of Hanoi
 */
public class Test1Hanoi {


    public static void main(String[] args) {
        Test1Hanoi t = new Test1Hanoi();
        t.toh(3,1,3,2,0);
        System.out.println(t.moves);
    }

    public long moves;
    public void toh(int N, int from, int to, int aux, long moves) {
        // Your code here


        if(N<=0){
            return;
        }

        moves++;
        this.moves = moves;
        if(N==1){
            System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
            return;
        }

        toh(N-1,from,aux,to,this.moves);
        System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
        toh(N-1,aux,to,from,this.moves);

    }
}
