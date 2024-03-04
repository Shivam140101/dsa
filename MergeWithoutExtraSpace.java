package Sorting;

public class MergeWithoutExtraSpace {

    public static int nextGap(int gap){
        if (gap == 0 || gap == 1) return 0;

        return (gap/2) + (gap%2);
    }

    public static void merge(long[] arr1 , long[] arr2 , int n , int m){
        int gap = n + m;
        int i , j;
        long temp;

        for (gap = nextGap(gap); gap > 0 ; gap = nextGap(gap)){
            for (i = 0 ; i+gap < n ; i++){
                if (arr1[i] > arr1[i+gap]){
                    temp = arr1[i];
                    arr1[i] = arr1[i+gap];
                    arr1[i+gap] = temp;
                }
            }

            for (j = gap > n ? gap-n :0 ; i<n && j<m ; j++){
                if (arr1[i] > arr2[j]){
                    temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }

            for (j=0 ; j+gap < n ; j++){
                if (arr2[j] > arr2[j+gap]){
                    temp = arr2[j];
                    arr2[j] = arr2[j+gap];
                    arr2[j+gap] = temp;
                }
            }
        }
    }

    public static void mergeSort(long[] arr1, long[] arr2){

        // Array1 = {0,1,2,3}
        // Array2 = {5,6,7,8,9}

        int n = arr1.length;
        int m = arr2.length;

        long[] arr3 = new long[n + m];
        int k=0;

        for (long value : arr1) {
            arr3[k] = value;
            k++;
        }

        for (long l : arr2) {
            arr3[k] = l;
            k++;
        }

        for (long z: arr3) {
            System.out.print(z+" ");
        }

    }

    static void printArray(long[] arr1 , long[] arr2){
        System.out.println("Array 1:= ");
        for (long i: arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Array 2:= ");
        for (long j: arr2){
            System.out.print(j+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        long[] arr1 = {1,3,5,7};
        long[] arr2 = {0,2,6,8,9};

        merge(arr1, arr2 , arr1.length , arr2.length);

        System.out.println("After Sort:- ");
        printArray(arr1 , arr2);

        System.out.println("Merging Both Arrays:- ");
        mergeSort(arr1, arr2);

    }
}
