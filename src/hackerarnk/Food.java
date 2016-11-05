package hackerarnk;

import java.util.Scanner;

/**
 * Created by oracle on 18/9/16.
 */
public class Food {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfItems=sc.nextInt();
        int notEat=sc.nextInt();
        int[] cost= new int[noOfItems];
        int costAllItems=0;
        for(int i=0;i<noOfItems;i++){
            cost[i]=sc.nextInt();
            costAllItems+=cost[i];
        }
        costAllItems-=cost[notEat];
        int charged=sc.nextInt();
        int halfCostOfItems=costAllItems/2;

        if(charged==halfCostOfItems)
            System.out.println("Bon Appetit");
        else
            System.out.println(charged-halfCostOfItems);
    }
}
