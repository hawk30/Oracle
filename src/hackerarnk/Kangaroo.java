package hackerarnk;

import java.util.Scanner;

/**
 * Created by oracle on 9/10/16.
 */
public class Kangaroo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //x2>x1
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        if(v2>v1)
            System.out.println("NO");
        if((x2-x1)%(v1-v2)==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
