package main.java.practice2026.array;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyInArray {

    public static void count(Object [] arr){

        Map<Object,Integer> map = new HashMap<>();

        for (Object num : arr){
            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        System.out.println(map);
    }

    public static void main(String[] args) {

        Object [] arr = {"my", "name","is","abhi","my","place","is","lko"};
        count(arr);

    }
}
