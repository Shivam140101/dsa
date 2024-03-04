package Sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {2,5,6,9,3,10,4};
        int n = arr.length;

        // Time Complexity = O(n^2)
        for (int i = 0; i < n-1; i++) {
            int min_ind = i;
            boolean swap = false;
            for (int j = i+1 ; j < n; j++) {
                if (arr[j] < arr[min_ind]) {
                    min_ind = j;
                    swap = true;
                }
            }
            if (swap) {
                int temp = arr[i];
                arr[i] = arr[min_ind];
                arr[min_ind] = temp;
            }else {
                break;
            }

        }
        System.out.println("After Sorting:- ");
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}
