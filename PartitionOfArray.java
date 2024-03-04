package Sorting;

public class PartitionOfArray {

    public static void partition(int[] arr, int l, int h, int p){

        int[] temp = new int[h-l+1];
        int index = 0;
        for(int i = l; i <= h; i++){
            if (arr[i] <= arr[p]){
                temp[index] = arr[i];
                index++;
            }
        }

        for (int i = l ; i <= h; i++){
            if (arr[i] > arr[p]){
                temp[index] = arr[i];
                index++;
            }
        }

        for (int i=l ; i<=h; i++){
            arr[i] = temp[i-l];
        }

        System.out.println("After partition");
        for (int z: arr) {
            System.out.print(z+" ");
        }

    }

    public static void main(String[] args) {

        int[] arr = {3,8,6,12,10,7};

        partition(arr, 0 , 5, 5);
    }
}
