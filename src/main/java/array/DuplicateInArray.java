package main.java.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

    public static void main(String[] args) {

        int [] arr = {2,3,1,4,6,7,0,2,5,6,8,1,3,2,4,5};

        Set<Integer> seen = new HashSet<>();

        for (Integer number: arr){

         if (!seen.add(number)){
             System.out.println("Duplicate found " + number);
             break;
         }
        }

    }
}
