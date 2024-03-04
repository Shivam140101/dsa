package Sorting;

import java.util.ArrayList;

public class MergeThreeSortedArrays {

    public static ArrayList<Integer> merge3Sorted(int[] a, int[] b, int[] c) {

        ArrayList<Integer> arr = new ArrayList<>();

        int m = a.length;
        int n = b.length;
        int o = c.length;

        int i=0 , j=0 , k=0;

        while(i < m && j < n && k<o) {

            int min = Math.min(Math.min(a[i], b[j]),c[k]);

            arr.add(min);

            if (min == a[i]) {
                i++;
            } else if (min == b[j]) {
                j++;
            }else if (min == c[k]) {
                k++;
            }
        }

        while (i < m && j < n){
            if (a[i] <= b[j]) {
                arr.add(a[i]);
                i++;
            }else{
                arr.add(b[j]);
                j++;
            }
        }

        while (i < m && k < o) {
            if (a[i] <= c[k]) {
                arr.add(a[i]);
                i++;
            }else {
                arr.add(c[k]);
                k++;
            }
        }

        while (j < n && k < o){
            if (b[j] <= c[k]){
                arr.add(b[j]);
                j++;
            }else {
                arr.add(c[k]);
                k++;
            }
        }

        while (i < m) {
            arr.add(a[i]);
            i++;
        }
        while (j<n){
            arr.add(b[j]);
            j++;
        }
        while (k<o){
            arr.add(c[k]);
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4};
        int[] b = {1,2,3,4,5};
        int[] c = {1,2,3,4,5,6};

        ArrayList<Integer> mergedArray = merge3Sorted(a, b, c);

        System.out.println(mergedArray);

    }
}
