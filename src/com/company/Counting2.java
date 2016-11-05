package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by oracle on 21/8/16.
 */
public class Counting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] freqArray = new int[100];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            freqArray[arr[i]]++;
        }
        for (int i = 0; i < 100; i++) {
            while (freqArray[i] != 0) {
                System.out.print(i + " ");
                freqArray[i]--;
            }
        }
    }
}
