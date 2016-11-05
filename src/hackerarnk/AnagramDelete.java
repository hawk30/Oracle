package hackerarnk;

import java.util.*;

/**
 * Created by oracle on 11/10/16.
 */
public class AnagramDelete {

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
    public static int numberNeeded(String first, String second) {
        Map<Character,Integer> list= new HashMap<>();
        for(char c: first.toCharArray()){
            int cnt=list.containsKey(c) ? list.get(c) :0;
            list.put(c,cnt+1);

    }
    for( char k : second.toCharArray()){
        int cnt=list.containsKey(k) ? list.get(k):0;
        list.put(k,cnt-1);
    }
        int total=0;
        List<Integer> values= new ArrayList<>(list.values());
        for(int a: values)
            total+=Math.abs(a);
        return total;
    }
   /* public static int numberNeeded(String first, String second) {
        int[] freq = new int[26];
        first.chars().forEach(c -> freq[c - 'a']++);
        second.chars().forEach(c -> freq[c - 'a']--);
        return Arrays.stream(freq).map(Math::abs).sum();
    }*/


}
