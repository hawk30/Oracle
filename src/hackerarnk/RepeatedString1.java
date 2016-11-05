package hackerarnk;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by oracle on 9/10/16.
 */
public class RepeatedString1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        int l=s.length();
        int noOfAs=s.length()-s.replace("a","").length();
        long noOfUnits=n/l;
        long remainder=n%l;
        int AsInremainder=0;
        if(remainder==0)
            System.out.println(noOfUnits*noOfAs);
        else {
            AsInremainder = s.substring(0, (int) remainder).length() - s.substring(0, (int) remainder).replace("a", "").length();
            System.out.println(noOfUnits * noOfAs + AsInremainder);
        }




    }
}
