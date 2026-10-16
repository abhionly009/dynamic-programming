package main.java.practice2026.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingElement {

    public static void firstNonRepeating(int [] input){

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for (Integer num : input){
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }

        for (Integer num : input){

            Integer i = map.get(num);

            if (i ==1){
                System.out.println("First non repeated element " + num);
                break;
            }

        }


    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,1,4,3,5,2};
        firstNonRepeating(arr);
    }
}
