package main.java.practice2026.array;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {

    public static void find(String input){

        char [] arr = input.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for (Character ch : arr){
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        System.out.println(map);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }

    public static void main(String[] args) {

        find("swiss");

    }
}
