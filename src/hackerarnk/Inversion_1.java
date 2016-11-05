package hackerarnk;

import java.util.Scanner;

/**
 * Created by oracle on 1/11/16.
 */
public class Inversion_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n= sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            System.out.println(partition(arr,0,arr.length-1));
        }

    }
    public static long partition(int [] arr, int low, int high){
        if(low==high)
            return 0;
        int middle=(high+low)/2;
        long count=0;
        count+=partition(arr,low,middle); //left inversions
        count+=partition(arr,middle+1,high); // right inversions
        count+=merge(arr, low, high); //split inversions
        return count;
    }
    public static long merge(int[] arr, int low, int high){
        int mid=(high+low)/2;
        int[] result= new int[high-low +1];
        int i=low;
        int j=mid+1;
        int iResult=0;
        long count=0;
        while(i<=mid && j<=high){
            if(arr[i]>arr[j]){
                result[iResult++]=arr[j++];
                count+=mid-i+1;
            }
            else
                result[iResult++]=arr[i++];

        }
        while(i<=mid)
            result[iResult++]=arr[i++];
        while(j<=high)
            result[iResult++]=arr[j++];
        System.arraycopy(result,0,arr,low,high-low+1);
        return count;

    }
}
