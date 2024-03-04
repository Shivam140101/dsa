package Sorting;

import java.util.ArrayList;

public class IntersectionTwoSortedArrays {


//    public static void intersection(int[] a , int[] b , int m , int n){
//        int i=0 , j=0;
//
//        System.out.println("Common Elements are:- ");
//        while (i < m && j < n){
//            if (i>0 && a[i] == a[i-1]){
//                i++;
//                continue;
//            }
//            if (a[i] < b[j]){
//                i++;
//            } else if (a[i] > b[j]){
//                j++;
//            }else {
//                System.out.print(a[i]+" ");
//                i++;
//                j++;
//            }
//        }
//
//    }

    public static ArrayList<Integer> printIntersection(int[] a, int[] b, int m , int n){

        ArrayList<Integer> result = new ArrayList<Integer>();

        int i=0 , j=0;

        while (i<m && j<n) {
            if (i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if (a[i]<b[j]){
                i++;
            } else if (a[i]>b[j]) {
                j++;
            }else {
                result.add(a[i]);
                i++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] a = {3,5,10,10,10,15,15,20};
        int[] b = {5,10,10,15,30};

        //intersection(a, b, a.length , b.length);

        ArrayList<Integer> result = printIntersection(a, b, a.length , b.length);
        System.out.println(result);
    }
}
