package hackerarnk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by oracle on 24/10/16.
 */
public class Median {

    public static double medianC(List<Integer> data){
         if((data.size() & 1) ==1)
             return data.get(data.size()/2);
        else {
             int midSize=data.size()/2;
             return (data.get(midSize-1)+data.get(midSize))/2.0;
         }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> data= new ArrayList<>();
        for(int i=0;i<n;i++) {
            //data.add(sc.nextInt());
            //Collections.sort(data);
            int value=sc.nextInt();
            int index=Collections.binarySearch(data, value);
            if(index<0)
                index=Math.abs(index)-1;
            data.add(index,value);
            System.out.println(medianC(data));
        }


    }

    }

