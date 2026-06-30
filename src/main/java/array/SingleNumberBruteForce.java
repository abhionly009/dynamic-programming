package main.java.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SingleNumberBruteForce {

    public int findSingleNumber(int [] input){

        Map<Integer, Integer> map = new HashMap<>();

        for (int num:input){
            if(map.containsKey(num)){

                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }


        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        for (Map.Entry<Integer,Integer> entry:entries){
            if (entry.getValue() ==1){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int [] input = {4,1,2,1,2};
        SingleNumberBruteForce singleNumber = new SingleNumberBruteForce();
        System.out.println(singleNumber.findSingleNumber(input));

    }
}
