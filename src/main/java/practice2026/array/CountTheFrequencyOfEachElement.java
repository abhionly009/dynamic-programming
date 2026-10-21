package main.java.practice2026.array;

import java.util.HashMap;
import java.util.Map;

public class CountTheFrequencyOfEachElement {

    public static void countFrequency(int [] arr){

        Map<Integer,Integer> map = new HashMap<>();

        for (Integer num : arr){

            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        System.out.println(map);

    }

    public static void main(String[] args) {

        int [] arr = {1,3,6,7,3,5,1,3,9};

        countFrequency(arr);

    }
}
