package main.java.practice2026.array;

import java.util.HashSet;
import java.util.Set;

public class TwoArrayContainsSameUniqueElement {

    // Check whether two arrays contain the same unique elements.

    public static boolean isSame(int [] arr, int [] input){


        Set<Integer> set1 = new HashSet<>();

        Set<Integer> set2 = new HashSet<>();

        for (Integer num : arr){
            set1.add(num);
        }

        for (Integer num : input){
            set2.add(num);
        }

       return set1.equals(set2);

    }


    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};

        System.out.println(isSame(arr1,arr2));

    }
}
