package Sorting;

import java.util.Arrays;
import java.util.Comparator;

class MyComp implements Comparator<Integer> {

    @Override
    public int compare(Integer a , Integer b) {
        return a%2 - b%2;
    }
}

public class SortingUsingComparator {

    public static void main(String[] args) {

        Integer[] arr = {10,20,5,7,12,3,40};

        Arrays.sort(arr , new MyComp());
        System.out.println("Arrays.sort:- " + Arrays.toString(arr));

    }
}
