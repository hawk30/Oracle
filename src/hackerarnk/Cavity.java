package hackerarnk;

import java.util.Scanner;

/**
 * Created by oracle on 11/9/16.
 */
public class Cavity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr= new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }

        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < n-1; j++) {
               int left=arr[i].charAt(j-1);
                int right=arr[i].charAt(j+1);
                int up=arr[i-1].charAt(j);
                int down=arr[i+1].charAt(j);
                int middle=arr[i].charAt(j);
                if(middle>left && middle>right && middle>up && middle>down)
                    arr[i] = arr[i].substring(0,j) + "X" + arr[i].substring(j+1);
            }

        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
