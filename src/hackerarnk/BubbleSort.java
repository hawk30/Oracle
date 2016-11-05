package hackerarnk;


import java.util.Scanner;
/**
 * Created by oracle on 30/10/16.
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubble(arr);
    }

    public static void bubble(int[] arr) {
        int noOfSwaps = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr,j);
                    noOfSwaps+=1;
                }
            }
            if(noOfSwaps==0)
                break;

        }
        System.out.println("Array is sorted in "+noOfSwaps+" swaps.");
        System.out.println("First Element: "+arr[0]);
        System.out.println("Last Element: "+arr[arr.length-1]);

    }
    public static void swap(int[] arr,int index){
        int temp=arr[index];
        arr[index]=arr[index+1];
        arr[index+1]=temp;
    }
}
