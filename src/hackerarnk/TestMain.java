package hackerarnk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by oracle on 26/10/16.
 */
public class TestMain {
    /*
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        int pos = Collections.binarySearch(list, 3);
        System.out.println("3 "+pos);
        pos=(Math.abs(pos)-1);
        System.out.println("absolute pos "+ (Math.abs(pos)-1));
        list.add(pos, 3);
         pos = Collections.binarySearch(list, 1);
        System.out.println("1 "+pos);
        System.out.println("absolute pos "+ (Math.abs(pos)-1));
        pos=(Math.abs(pos)-1);
        list.add(pos,1);
         pos = Collections.binarySearch(list, 7);
        System.out.println("7 "+pos);
        System.out.println("absolute pos "+ (Math.abs(pos)-1));
        //if (pos < 0) pos = Math.abs(pos) - 1;
        pos=(Math.abs(pos)-1);
        list.add(pos,7);
        System.out.println();
        System.out.println("list ="+list);*/
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list= new ArrayList<>();
        int[] arr= new int[10];
        for(int i=0;i<10;i++){
            int rand= (int)(Math.random()*50+1);
            int pos= Collections.binarySearch(list,rand);
            if(pos<0) pos=Math.abs(pos)-1;
            list.add(pos,rand);
    }
        System.out.println(list);
    }
*/
    public static void main(String[] args) {
        System.out.println("bac".compareTo("bcd"));
    }
}
