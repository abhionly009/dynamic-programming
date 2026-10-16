package main.java.practice2026.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountUniqueElementInArray {

    public static void count(int [] input){

        int uniqueCount = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num : input){
            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }


        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        for (Map.Entry<Integer,Integer> entry:entries){
            if (entry.getValue() ==1){
                uniqueCount++;
            }
        }

        System.out.println(uniqueCount);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,1,4,3,5,2};
        count(arr);
    }
}
