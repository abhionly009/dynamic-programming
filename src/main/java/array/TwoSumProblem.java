package main.java.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public int [] findIndex(int [] nums, int target){

        Map<Integer,Integer> map = new HashMap<>();

        for (int i =0;i<nums.length;i++){
            int complement = target-nums[i];
            if (map.containsKey(complement)){
               return new int [] {map.get(complement),i};
            }
                map.put(nums[i],i);

        }

        return new int [] {-1,-1};
    }

    public static void main(String[] args) {
        int [] input = {3,2,4};
        TwoSumProblem sumProblem = new TwoSumProblem();
        int [] result = sumProblem.findIndex(input,6);
        System.out.println(result[0] + " " + result[1]);
    }

}
