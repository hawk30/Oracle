package hackerarnk;

import java.util.Scanner;

/**
 * Created by oracle on 11/10/16.
 */
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        for(int i=0;i<k;i++){
            int temp=a[0];
            for(int j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[a.length-1]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
