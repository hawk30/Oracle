package hackerarnk;

import java.util.Scanner;

/**
 * Created by oracle on 8/9/16.
 */
public class chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            int choc = n / c;
            int wrap = n / c;


            while (wrap >= m) {
                choc += (wrap / m);

                wrap =  (wrap % m) + (wrap / m);


            }
            System.out.println(choc);
        }
    }
}
