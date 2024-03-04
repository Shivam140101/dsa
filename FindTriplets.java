package Sorting;

import java.util.Arrays;

public class FindTriplets {

    public static boolean findTriplets(int[] arr, int n){

        boolean found = false;

        for (int i =0 ; i < n ; i++) {
            int a = arr[i];
            int b = i+1;
            int c = n-1;

            while (b < c) {
                if (a + arr[b] + arr[c] == 0){
                    found = true;
                    break;
                } else if (a + arr[b] + arr[c] < 0) {
                    b++;
                }else {
                    c--;
                }
            }
            if (found) {
                break;
            }
        }
        return found;
    }


    public static void main(String[] args) {

        int[] a = {0, -1, 2, -3, 1};

        Arrays.sort(a);
        boolean found = findTriplets(a, a.length);
        System.out.println("found " + found);
    }
}
