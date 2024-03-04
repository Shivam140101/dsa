package Sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5,6,2,4,9};
        int n = arr.length;
/*
        // Time Complexity = O(n^2)
        for (int i = 0; i < n-1; i++) {
            for (int j = 0 ; j < n-i-1 ; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After sorting:- ");
        for (int i : arr) {
            System.out.print(i+" ");
        }

 */

        // Optimized Bubble Sort
        for (int i = 0 ; i < n-1 ; i++) {
            boolean swap = false;
            for (int j = 0 ; j < n-i-1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
        System.out.println("After Sort: ");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
