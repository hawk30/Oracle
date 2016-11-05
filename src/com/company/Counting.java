package com.company;

import java.util.Scanner;

/**
 * Created by oracle on 17/8/16.
 */
public class Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] ar = new int[size];
        int[] ar1 = new int[100];
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
            ar1[ar[i]]++;

        }




        for (int i = 0; i < 100; i++)
            System.out.print(ar1[i] + " ");

        sc.close();
    }
}