package lok.ac.in.dataStructure.pracTest;

/**
 * Created by Lokesh Sharma on 23-05-2019.
 */
public class prac2 {

    public static void main(String[] args) {
        //int a[] = {2,4,6,8,9,10,12};
        //int b[] = {2,4,6,8,10,12};

        int a[] ={3,5,7,9,11,13};
        int b[] = {3,5,7,11,13};


        GfG g = new GfG();

        System.out.println(g.findExtra(a,b,a.length));

        //System.out.println(findExtra(a,b,a.length));
    }

    public static int findExtra(int a[],int b[],int n){

        int extra = 0;

        int lenA = a.length-1;

        int jumpValue = (int) Math.floor(Math.sqrt(lenA));

        int breakValue =0;
        int i=0;
        for(;i<lenA;i=i+jumpValue){
            if(b[i]!=a[i]){
                breakValue = i;
                break;
            }
        }

        int ans = 0;

        if(breakValue == 0){
            for(int j =lenA-jumpValue; j<lenA;j++){
                if(b[j]!=a[j]){
                    ans = j;
                    break;
                }
            }
        }else {
            for(int j =breakValue-jumpValue; j<=breakValue;j++){
                if(b[j]!=a[j]){
                    ans = j;
                    break;
                }
            }
        }


        extra = ans;

        return extra;
    }
}




class GfG
{
    public int findExtra(int a[],int b[],int n){

        if(a[0]!=b[0]){
            return 0;
        }else if(a[n-1]!=b[n-2]){
            return n-1;
        }

        int lenA = a.length-1;

        int jumpValue = (int) Math.floor(Math.sqrt(lenA));

        int breakValue =0;
        int i=0;
        for(;i<lenA;i=i+jumpValue){
            if(b[i]!=a[i]){
                breakValue = i;
                break;
            }
        }

        int ans = 0;

        if(breakValue == 0){
            for(int j =lenA-jumpValue; j<lenA;j++){
                if(b[j]!=a[j]){
                    ans = j;
                    break;
                }
            }
        }else {
            for(int j =breakValue-jumpValue; j<=breakValue;j++){
                if(b[j]!=a[j]){
                    ans = j;
                    break;
                }
            }
        }



        return ans;
    }
}
