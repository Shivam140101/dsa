package Sorting;

public class QuickSortUsingHoarePartition {

    public static void quickSort(int[] arr , int low , int high){
        if(low < high){
            int pi = partition(arr, low, high);

            quickSort(arr,low ,pi);
            quickSort(arr,pi+1, high);

        }
    }


    public static int partition(int[] arr , int low , int high){

        int pivot = arr[low];
        int i = low-1;
        int j = high+1;

        while(true){
            do{
                i++;
            }while(arr[i] < pivot);

            do{
                j--;
            }while(arr[j] > pivot);

            if(i >= j){
                return j;
            }else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }



    public static void main(String[] args){

        int[] arr = {4,1,3,7,9};
        System.out.println("Array before quickSort:- ");
        printArray(arr);

        quickSort(arr,0,arr.length-1);

        System.out.println("\nArray after quickSort:- ");
        printArray(arr);
    }
}
