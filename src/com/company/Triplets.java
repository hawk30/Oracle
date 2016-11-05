package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by oracle on 3/9/16.
 */
public class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();

        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
        int count=0;
        for(Integer i: arr){
            if( arr.contains(i+d) && arr.contains(i+(2*d)))
                count++;
            else
                continue;
        }
        System.out.println(count);
    }
}
