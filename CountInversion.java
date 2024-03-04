package Sorting;

public class CountInversion {

    public static int countInversion(long[] arr , int l , int r){
        int count = 0;
        if (l <r){
            int m = l+(r-l)/2;
            count += countInversion(arr, l, m);
            count += countInversion(arr, m + 1, r);
            count += countAndMerge(arr,l,m,r);
        }
        return count;
    }

    public static int countAndMerge(long[] arr, int l, int m, int r) {

        int n1 = m-l+1;
        int n2 = r-m;

        long[] left = new long[n1];
        long[] right = new long[n2];

        for (int i=0 ; i<n1 ; i++){
            left[i] = arr[i+1];
        }

        for (int i=0 ; i<n2 ; i++){
            right[i] = arr[m+1+i];
        }

        int i=0,j=0,k=l;
        int count=0;
        while (i < n1 && j < n2){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else {
                arr[k] = right[j];
                j++;
                count = count+(n1-i);
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
        return count;
    }


    public static void main(String[] args) {

        long[] arr = {2, 4, 1, 3, 5};

        countInversion(arr , 0 , arr.length-1);


    }
}
