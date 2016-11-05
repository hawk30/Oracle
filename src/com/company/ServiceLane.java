package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by oracle on 3/9/16.
 */
public class ServiceLane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); //service lane length
        int t=sc.nextInt(); // no of test cases
       // int[] arr= new int[n];
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        while(t>0){
            t--;
            int i=sc.nextInt();
            int j=sc.nextInt();
            int min_w=Integer.MAX_VALUE;
            for(int k=i;k<=j;k++){
                if(arr.get(i)<min_w)
                    min_w=arr.get(k);
            }
            System.out.println(min_w);

        }
    }
}
