package com.company;

import java.util.Scanner;

/**
 * Created by oracle on 9/8/16.
 */
public class Polygons {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        sum/=2;
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(arr[i]<sum)
                continue;
            else
                flag=false;
        }
        if(flag==false)
            System.out.println(1);
        else
            System.out.println(0);


    }
}
