import java.util.Scanner;

/**
 * Created by oracle on 9/8/16.
 */
public class Cookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m / n < 1)
            System.out.println(n - m);
        else if (m / n == 1)
            System.out.println(0);
        else {
            if (m % n == 0)
                System.out.println(0);
            else
                System.out.println(n - (m % n));

        }
    }
}
