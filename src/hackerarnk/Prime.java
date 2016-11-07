package hackerarnk;

import java.util.Scanner;

/**
 * Created by oracle on 6/11/16.
 */
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(checkPrime(num)) System.out.println("Prime");
            else System.out.println("Not prime");
        }
    }
    public static boolean checkPrime(int num){
        if(num==1) return false;
        if(num==2) return true;
        if(num==3) return true;;
        if(num%2==0) return false;
        if(num%3==0) return false;;
        int i=5, k=2;
        while(i*i<=num){
            if(num%i==0) return false;
            i+=k;
            k=6-k;
        }
        return true;
    }
}
