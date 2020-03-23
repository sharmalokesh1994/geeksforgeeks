package com.company.DSA.week8.greedy.Test4;

import java.util.ArrayList;
import java.util.Collections;

/*
**************************************************************
Fractional Knapsack
* ************************************************************
 */

/*
Given weights and values of N items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
Note: Unlike 0/1 knapsack, you are allowed to bread the item.
 */


public class Test4solve {
    double fractionalKnapsack(int W, Item arr[], int n) {
        // Your code here

        ArrayList<ItemPerValue> aList = new ArrayList<>();

        for(int i=0;i<n;i++){
            ItemPerValue temp = new ItemPerValue();
            temp.item = arr[i];

            double weight = arr[i].weight;
            double value = arr[i].value;

            temp.price = value/weight;

            aList.add(temp);

        }

        Collections.sort(aList);

       /* for(int i=0;i<n;i++){
            System.out.println(aList.get(i).price );
        }
        */

        int weight = W;
        double ans = 0;

        for(ItemPerValue t : aList){

            int w = t.item.weight;

            if(weight==0){
                break;
            }

            if(weight >w ){
                ans = ans + t.item.value;
                weight = weight - w;
            }else{
                ans = ans + t.price*weight;
                weight = 0;
            }

        }

        return ans;

    }
}

class ItemPerValue implements Comparable<ItemPerValue>{

    Item item;
    double price;

    public int compareTo(ItemPerValue t){
        if(t.price>= this.price){
            return 1;
        }else{
            return -1;
        }
    }

}

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
