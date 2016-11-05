package hackerarnk;

import java.util.List;

/**
 * Created by oracle on 31/10/16.
 */
public class MergeSort {
    public static void main(String[] args) {
        Integer[] arr=new Integer[100];
        for(int i=0;i<100;i++){
            arr[i]=(int)(Math.random()*100+1);
        }
        partition(arr);
        for(int k: arr)
        System.out.print(" "+k);
    }
    public static Integer[] partition(Integer[] list){
        if(list.length<=1)
            return list;
        Integer[] first=new Integer[list.length/2];
        Integer[] second= new Integer[list.length-first.length];
        System.arraycopy(list,0,first,0,first.length);
        System.arraycopy(list,first.length,second,0,second.length);
        partition(first);
        partition(second);
        merge(first,second,list);
        return list;
    }
    public static void merge(Integer[] first, Integer[] second, Integer[] result){
        int iFirst=0, iSecond=0, iResult=0;
        while(iFirst<first.length && iSecond<second.length){
            if(first[iFirst].compareTo(second[iSecond])<0) {
                result[iResult] = first[iFirst];
                iFirst++;
            }
            else{
                result[iResult]=second[iSecond];
                iSecond++;
            }
            iResult++;
        }
        System.arraycopy(first,iFirst,result,iResult,first.length-iFirst);
        System.arraycopy(second,iSecond,result,iResult,second.length-iSecond);
    }
}
