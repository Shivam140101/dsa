package Sorting;

public class LomutoPartition {

    public static int lomutoPartition(int[] arr, int l , int h){

        int pivot = arr[h];
        int i = l-1;

        for (int j=l ; j<= h-1 ; j++){
            if (arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp1 = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp1;

        printArray(arr);
        return (i+1);
    }

    public static void printArray(int[] arr){

        System.out.println("After Partition");
        for (int i: arr){
            System.out.print(i+" ");
        }
    }


    public static void main(String[] args) {

        int[] arr = {3,8,6,12,10,7};
        int partition = lomutoPartition(arr, 0, arr.length - 1);
        System.out.println("\nIndex after pivot:- "+partition);
    }
}
