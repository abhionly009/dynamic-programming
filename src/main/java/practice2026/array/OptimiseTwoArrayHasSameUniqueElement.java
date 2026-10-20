package main.java.practice2026.array;

import java.util.HashSet;
import java.util.Set;

public class OptimiseTwoArrayHasSameUniqueElement {

    public  static boolean isSame(int [] arr, int [] input){
        Set<Integer> set = new HashSet<>();

        for (Integer num : arr){
            set.add(num);
        }

        for (Integer num : input){
            set.remove(num);
        }

      return  set.isEmpty();
    }


    public static void main(String[] args) {

//        int[] arr1 = {1, 2, 3};
//        int[] arr2 = {1, 2, 4};

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {4, 3, 2, 1, 1};

        System.out.println(isSame(arr1,arr2));

    }
}
