package main.java.practice2026.twoPointer;

public class PalindromeCheckUsingTwoPointer {

    public static boolean isPalindrome(String input){

        if (input == null || input.isBlank() ){
            return false;
        }
        char [] chars = input.toCharArray();


        int left = 0;
        int right = chars.length-1;

        while (left<right){
            if (chars[left] != chars[right]){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "LEVEL";

        System.out.println( isPalindrome(input));

    }
}
