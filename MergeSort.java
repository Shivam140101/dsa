package Sorting;

public class MergeSort {

    static void mergeSort(int[] arr, int start, int end){

        if (start < end){
            int mid = start + (end - start)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start , mid , end);
        }

    }

    static void merge(int[] arr, int start, int mid, int end){

        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0; i < n1 ; i++){
            left[i] = arr[start + i];
        }
        for (int j = 0; j < n2 ; j++){
            right[j] = arr[mid + 1 + j];
        }

        // left array = {5,10,30}
        // right array = {7,5}
        // Perform Merge Two Sorted Array

        int i=0 , j=0 ;
        int k=start;
        while(i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    static void printArray(int[] arr){
        for (int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 30, 15, 7};

        System.out.println("Original Array:- ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Merge Sort:- ");
        printArray(arr);

    }
}
