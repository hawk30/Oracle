package hackerarnk;

import java.util.Scanner;

/**
 * Created by oracle on 6/11/16.
 */
public class Fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        fibonacci(n);
    }
    public static int fibonacci(int n){
        if(n<1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

}
