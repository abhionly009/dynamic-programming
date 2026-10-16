package main.java.practice2026.array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void removeDuplicateFromArray(int [] input){

        Set<Integer> seen = new LinkedHashSet<>();

        for (Integer num : input){

            seen.add(num);

        }

        Integer [] unique =  seen.toArray(new Integer[0]);

        for (Integer num : unique){
            System.out.print(num +" ");
        }
    }

    public static void main(String[] args) {

        int [] arr =  {4, 5, 1, 2, 1,3,7, 4, 5};
        removeDuplicateFromArray(arr);
    }
}
