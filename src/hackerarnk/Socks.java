package hackerarnk;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by oracle on 9/10/16.
 */
public class Socks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
         }
        Map<Integer, Integer>list= new HashMap<>();
        for (int i=0;i<n;i++){
            if(list.containsKey(c[i]))
                list.put(c[i],list.get(c[i])+1);
            else
                list.put(c[i],1);
        }
        int count=0;
        for( int k: list.keySet()){
              if(list.get(k)%2==0)
                count+=list.get(k)/2;
            else
                count+=(list.get(k)-1)/2;
        }
        System.out.println(count);

    }
}
