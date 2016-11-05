package hackerarnk;

import java.util.*;

/**
 * Created by oracle on 13/10/16.
 */
public class RansomNote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for (int magazine_i = 0; magazine_i < m; magazine_i++) {
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for (int ransom_i = 0; ransom_i < n; ransom_i++) {
            ransom[ransom_i] = in.next();
        }
        Arrays.sort(magazine);
        Arrays.sort(ransom);
        List<String> magz = new ArrayList<>(Arrays.asList(magazine));
        boolean flag = true;
        for (String ran : ransom) {
           if(!magz.remove(ran))
               flag=false;
        }
        if (flag == true)
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}