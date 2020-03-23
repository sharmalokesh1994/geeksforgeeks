package com.company.DSA.week8.greedy.Test3;

import java.util.*;
/*
***********************************************
N meetings in one room
* *********************************************
 */

/*
There is one meeting room in a firm. There are N meetings in the form of (S[i], F[i]) where S[i] is start time of meeting i and F[i] is finish time of meeting i.

What is the maximum number of meetings that can be accommodated in the meeting room?
 */

public class Test3Meeting {
    static void maxMeetings(int start[], int end[], int n)
    {
        // add your code here

        ArrayList<MeetingTime> aList = new ArrayList<>();

        for(int i=0;i<n;i++){
            MeetingTime m = new MeetingTime();
            m.s = start[i];
            m.e = end[i];
            m.id = i+1;
            aList.add(m);
        }

        Collections.sort(aList);

        /*for(MeetingTime m : aList){
            System.out.println("S: "+m.s+"E: "+m.e+"id: "+m.id);
        }*/

        StringBuffer ans = new StringBuffer();

        ans.append(aList.get(0).id+" ");
        int last = aList.get(0).e;

        for(int i=1;i<n;i++){
            int t = aList.get(i).s;
            if(t>=last){
                ans.append(aList.get(i).id+" " );
                last = aList.get(i).e;
            }
        }

        System.out.print(ans.toString() );

    }
}

class MeetingTime implements Comparable<MeetingTime>{
    int id = 0;
    int s = 0;
    int e = 0;

    public int compareTo(MeetingTime t){
        return this.e-t.e;
    }

}
