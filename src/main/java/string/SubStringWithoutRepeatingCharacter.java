package main.java.string;

import main.java.dutchNationalFlag.Mail;

import java.util.HashMap;
import java.util.Map;

public class SubStringWithoutRepeatingCharacter {

    public int findSubString(String input){

        int left = 0;
        int maxLen =0;
        Map<Character,Integer> map = new HashMap<>();

        for (int right = 0;right<input.length();right++){
            char ch = input.charAt(right);
            if (map.containsKey(ch)){
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch,right);

            maxLen = Math.max(maxLen,right-left+1);

        }


        return maxLen;
    }

    public static void main(String[] args) {

        SubStringWithoutRepeatingCharacter sb = new SubStringWithoutRepeatingCharacter();
        int max = sb.findSubString("abcabcbb");
        System.out.println(max);

    }
}
