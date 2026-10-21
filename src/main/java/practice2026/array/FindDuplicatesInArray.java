package main.java.practice2026.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesInArray {

    public static void findDuplicates(int [] arr){

        Map<Integer,Integer> map = new HashMap<>();

        for (Integer num : arr){

            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        for (Map.Entry<Integer, Integer> entry :entries){
            if (entry.getValue()>1){
                System.out.println(entry);
            }

        }

    }

    public static void main(String[] args) {

        int [] arr = {2,4,6,2,6,5,9,5,6};

        findDuplicates(arr);

    }
}
