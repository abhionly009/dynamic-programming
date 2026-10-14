package main.java.practice2026.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static boolean isSumAvailable(int [] input, int target){
        boolean isAvailable = false;

        Map<Integer,Integer> map = new HashMap<>();

        for (int i =0;i<input.length;i++){

         int compliment = target - input[i];

         if (map.containsKey(compliment)){
            return true;

         }
         map.put(i,input[i]);
        }
        return isAvailable;
    }

    public static void main(String[] args) {

        int [] input = {2,4,6,1,9};
        int target = 10;

       boolean result =  isSumAvailable(input, target);

        System.out.println(result);

    }
}
