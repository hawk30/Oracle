package hackerarnk;

/**
 * Created by oracle on 31/10/16.
 */
public class QuickSort {
    public static void main(String[] args) {
        int [] arr= new int[100];
        for(int i=0;i<arr.length;i++)
            arr[i]=(int)(Math.random()*100+1);
        quickSort(arr,0,arr.length-1);
        for(int k: arr)
            System.out.print(" "+k);
    }
    public static void quickSort(int[] arr, int low, int high){
        if(arr.length==0 || arr==null)
            return;
        if(low>=high)
            return;
        int middle=low+(high-low)/2;
        int pivot=arr[middle];
        int i=low, j=high;
        while(i<=j){
            while(arr[i]<pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            if(i<=j){
                swap(arr,i,j);
                i++;
                j--;
            }

        }
        if(low<j)
            quickSort(arr,low,j);
        if(high>i)
            quickSort(arr,i,high);
    }
    public static void swap(int[] arr, int low, int high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
}
