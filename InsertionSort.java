package Sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {0, -1, 2, -3, 1};
        int n = arr.length;

        // Time Complexity = O(n^2)
        for (int i=1 ; i<n ; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("After Sorting:- ");
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}
