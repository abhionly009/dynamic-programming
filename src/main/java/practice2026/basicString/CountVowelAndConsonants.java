package main.java.practice2026.basicString;

public class CountVowelAndConsonants {

    public static void countAlphabet(String input){

        int vowel = 0;
        int consonants = 0;
        int others = 0;

        for (int i =0;i<input.length();i++){
            char ch = input.toLowerCase().charAt(i);
            if (Character.isLetter(ch)){
                if (ch == 'a' ||ch == 'e'|| ch =='i'||ch == 'o'||ch =='u'){
                    vowel++;
                }else {
                    consonants++;
                }
            }else {
                others++;
            }

        }

        System.out.println("total vowels in given string was  " + vowel);
        System.out.println("total consonants in given string was  " + consonants);
        System.out.println("total other character in given string was  " + others);
    }

    public static void main(String[] args) {

        countAlphabet("I am abhinandan");
    }
}
