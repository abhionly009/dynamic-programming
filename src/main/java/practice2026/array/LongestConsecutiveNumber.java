package main.java.practice2026.array;

import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveNumber {

    public static int find(int [] arr){

        int currentCount = 1;
        int maxCount = 1;
        Integer previous = null;

        Set<Integer> set = new TreeSet<>();
        for (Integer num :arr){
            set.add(num);
        }

        for (Integer num :set){
            if (previous == null || num != previous + 1) {
                currentCount = 1;
            } else {
                currentCount++;
            }

            maxCount = Math.max(maxCount, currentCount);
            previous = num;
        }
        return maxCount;
    }

    public static void main(String[] args) {

        int [] arr = {1,4,5,8,6,22};

        System.out.println( find(arr));
    }
}
