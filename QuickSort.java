package Sorting;

public class QuickSort {


    // Using Lomuto Partition
    public static void quickSort(int[] arr, int low , int high){
        if(low < high){

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low , int high){

        int pivot = arr[high];
        int i = low - 1;

        for(int j = low ; j <= high-1 ; j++) {
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp1 = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp1;

        return (i+1);
    }

    public static void printArray(int[] arr){

        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {4,1,3,9,7};

        System.out.println("Array Before Sort:- ");
        printArray(arr);

        // Apply Quick Sort
        quickSort(arr,0,arr.length-1);

        System.out.println("\nArray After Sort:- ");
        printArray(arr);

    }
}
