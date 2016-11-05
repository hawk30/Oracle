package com.company;

import java.util.Scanner;

/**
 * Created by oracle on 9/8/16.
 */
public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int n=2;
        while(3*(n-1)<t)
            n*=2;
        System.out.println(3*(n-1)-t+1);

    }
}
