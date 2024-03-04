package Sorting;

import java.util.ArrayList;

public class UnionTwoSortedArrays {


//    public static void union(int[] a , int[] b , int m , int n){
//        int i=0 , j=0;
//
//        while(i < m && j < n){
//            if (i >0 && a[i] == a[i-1]){
//                i++;
//                continue;
//            }
//            if (j > 0 && b[j] == b[j-1]){
//                j++;
//                continue;
//            }
//            if (a[i] < b[j]){
//                System.out.print(a[i]+" ");
//                i++;
//            } else if (a[i] > b[j]) {
//                System.out.print(b[j]+" ");
//                j++;
//
//            }else{
//                System.out.print(a[i]+" ");
//                i++;
//                j++;
//            }
//        }
//        while (i < m){
//            if (i>0 && a[i] != a[i-1]){
//                System.out.print(a[i]+" ");
//                i++;
//            }
//        }
//        while (j < n){
//            if (j>0 && b[j] != b[j-1]){
//                System.out.print(b[j]+" ");
//                j++;
//            }
//        }
//
//    }

    public static ArrayList<Integer> findUnion(int[] a, int[] b, int n, int m)
    {
        // add your code here
        ArrayList<Integer> arr = new ArrayList<>();

        int i=0 , j=0;
        while(i < n && j < m){
            if(i>0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            if(j>0 && b[j] == b[j-1]){
                j++;
                continue;
            }
            if(a[i] < b[j]){
                arr.add(a[i]);
                i++;
            }else if(a[i] > b[j]){
                arr.add(b[j]);
                j++;
            }else{
                arr.add(a[i]);
                i++;
                j++;
            }
        }
        while(j<m)
        {
            if(j>0 && b[j] == b[j-1])
            {
                j++;
                continue;
            }
            arr.add(b[j]);
            j++;

        }
        while(i<n)
        {
            if(i>0 && a[i] ==a[i-1])
            {
                i++;
                continue;
            }
            arr.add(a[i]);
            i++;
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] a = {3,5,8};
        int[] b = {2,8,9,10,15};

        System.out.println("Union of both the Arrays");
        //union(a, b, a.length, b.length);
        ArrayList<Integer> arr = findUnion(a, b,a.length,b.length);
        System.out.println(arr);
    }
}
