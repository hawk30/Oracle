package hackerarnk;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by oracle on 29/10/16.
 */
public class Trie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Map<String,Integer> list= new HashMap<>();
        for(int i=0;i<n;i++){
            String op=sc.next();
            String contact=sc.next();
            if("add".equals(op)){
                for(int j=0;j<contact.length();j++){
                    String temp=contact.substring(0,j);
                    int cnt=list.containsKey(temp)?list.get(temp)+1:1;
                    list.put(temp,cnt);
                }
            }
            else if("find".equals(op)){
                Integer rs=list.get(contact);
                if(rs!=null)
                    System.out.println(rs);
                else
                    System.out.println("0");
            }

        }
    }
}
