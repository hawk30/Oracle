package hackerarnk;

import java.util.Scanner;

/**
 * Created by oracle on 30/10/16.
 */
public class Inversion {
    public static long inversion;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            partition(arr);
            System.out.println(inversion);
        }
    }

    public static long partition(Integer[] arr) {
        if (arr.length <= 1)
            return 0;
        Integer[] first = new Integer[arr.length / 2];
        Integer[] second = new Integer[arr.length - first.length];
        System.arraycopy(arr, 0, first, 0, first.length);
        System.arraycopy(arr, first.length, second, 0, second.length);

        inversion+=partition(first);
        inversion+=partition(second);
        inversion+=mergerSort(first, second, arr);
        return  inversion;
    }

    public static long mergerSort(Integer[] first, Integer[] second, Integer[] merged) {
        int iFirst = 0, iSecond = 0, iMerged = 0;
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst].compareTo(second[iSecond]) < 0) {
                merged[iMerged] = first[iFirst];
                iFirst++;
            } else {
                merged[iMerged] = second[iSecond];
                inversion+=first.length-iFirst+1;
                iSecond++;
            }
            iMerged++;

        }
        System.arraycopy(first,iFirst,merged,iMerged,first.length-iFirst);
        System.arraycopy(second,iSecond,merged,iMerged,second.length-iSecond);
        return inversion;
    }
}
