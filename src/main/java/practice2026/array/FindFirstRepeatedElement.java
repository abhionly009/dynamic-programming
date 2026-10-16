package main.java.practice2026.array;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedElement {

    public static void findFirstRepeatedElement( int [] input){

        Set<Integer> seen = new HashSet<>();

        for (Integer num : input){

            if (!seen.add(num)){
                System.out.println("First repeated element " + num);
                break;
            }

        }
    }

    public static void main(String[] args) {

        int [] arr = {2,4,5,2,3,5,2};

      findFirstRepeatedElement(arr);

    }
}
