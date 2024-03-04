package Sorting;

public class HoarePartition {

    public static int hoarePartition(int[] arr, int l , int h){
        int pivot = arr[l];
        int i = l-1 , j = h+1;

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return j;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {3,8,6,12,10,7};

        int hoared = hoarePartition(arr, 0, arr.length - 1);
        System.out.println(hoared);
    }
}
