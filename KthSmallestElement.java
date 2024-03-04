package Sorting;

public class KthSmallestElement {

    public static int kthSmallest(int[] arr, int n, int k)
    {
        // Your code here
        int low = 0;
        int high = n-1;

        while(low <= high){
            int pi = partition(arr,low,high);

            if(pi == k-1){
                return arr[pi];
            }else if(pi > k-1){
                high = pi -1;
            }else {
                low = pi+1;
            }
        }
        return -1;
    }

    public static int partition(int[] arr , int low , int high){
        int pivot = arr[high];
        
        int i = low-1;
        for(int j = low ; j<= high -1 ; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    }

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {

        int[] arr = {3,5,4,2,9};

        int kthSmallest = kthSmallest(arr, arr.length, 4);
        System.out.println(kthSmallest);


    }
}
