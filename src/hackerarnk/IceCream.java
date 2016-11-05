package hackerarnk;

import java.util.*;

/**
 * Created by oracle on 2/11/16.
 */
public class IceCream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int money=sc.nextInt();
            int noFlavour=sc.nextInt();
            int[] costFlavours= new int[noFlavour];
            for(int i=0;i<noFlavour;i++)
                costFlavours[i]=sc.nextInt();
/*            for(int i=0;i<noFlavour;i++){
                for(int j=0;j<i;j++){
                    if(!(costFlavours[i]+costFlavours[j]==money))
                        continue;
                    else
                        System.out.print(j+1+" "+(i+1));

                }
            }
            System.out.println();*/
            int a=0,b=0;
            Map<Integer,Integer> list=new HashMap<>();
            for(int i=0;i<noFlavour;i++){
                if(list.containsKey(money-costFlavours[i])){
                    a=list.get(money-costFlavours[i]);
                    b=i+1;
                }
                list.put(costFlavours[i],i+1);
            }
            System.out.print(a+" "+b);

        }
    }
}
