package main.java.practice2026.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

    public static void main(String[] args) {

        int [] arr = {2,1,4,6,4,5,1,5,2,9};

        Set<Integer> seen = new HashSet<>();

        for (Integer number : arr){

            if (!seen.add(number)){
                System.out.println("Duplicate found " + number);
                break;
            }
        }

    }
}
