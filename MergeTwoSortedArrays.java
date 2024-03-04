package Sorting;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {

        int[] arr = {10,15,20};
        int[] brr = {5,6,6,15};

        int m = arr.length;
        int n = brr.length;

        int[] crr = new int[m + n];


        int i=0 , j=0 , k=0;
        while(i < m && j < n) {
            if (arr[i] < brr[j]) {
                crr[k] = arr[i];
                i++;
                k++;
            } else {
                crr[k] = brr[j];
                j++;
                k++;
            }
        }
        while (i < m){
            crr[k] = arr[i];
            i++;
            k++;
        }
        while (j < n){
            crr[k] = brr[j];
            j++;
            k++;
        }

        System.out.println("After Merging:- ");
        for (int z: crr){
            System.out.print(z+" ");
        }


    }
}
