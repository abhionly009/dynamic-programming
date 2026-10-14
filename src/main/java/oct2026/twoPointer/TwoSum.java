package main.java.oct2026.twoPointer;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public boolean findTwoSum(int [] input, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for (int i =0;i<input.length;i++){
            int compliment = target-input[i];
            if (map.containsKey(compliment)){
                return true;
            }

            map.put( input[i], i);
        }

      return false;


    }

    public static void main(String[] args) {

        int [] input = {2,4,6,1,9};
        int target = 18;

        TwoSum twoSum = new TwoSum();

       boolean result =  twoSum.findTwoSum(input,target);

       System.out.println(" Target is found in  given array " +result);
    }
}
