package main.java.string;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrance {

    public void countCharacterOccurrence(String input){

        Map<Character,Integer> map = new HashMap<>();

        for (int i =0;i<input.length();i++){
            char ch = input.charAt(i);

            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }

        }

        System.out.println(map);

    }

    public static void main(String[] args) {

        CharacterOccurrance characterOccurrance = new CharacterOccurrance();

        characterOccurrance.countCharacterOccurrence("abhinandan");

    }
}
