package main.java.practice2026.basicString;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String str1, String str2){
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

      return Arrays.equals(ch1,ch2);

    }

    public static void main(String[] args) {

        System.out.println( isAnagram("heart", "earth"));

    }
}
