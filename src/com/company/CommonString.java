package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by oracle on 16/8/16.
 */
public class CommonString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            String a = sc.next();
            String b = sc.next();
            char[] c = a.toCharArray();
            char[] d = b.toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);


        }
    }
}
