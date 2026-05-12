package main.java.twoPointer;

/**
 * Check if a string is palindrome
 * Given a string you need to check whether given string is palindrome or not
 * example
 *  input = madam
 *  reversed String = madam
 *  both are same so string is palindrome
 *
 */
public class Palindrome {

    public static String reverseString(String input){

        int left =0;
        int right = input.length()-1;
        char [] data = input.toCharArray();
        while (left<right){
            char ch =data[right];
            data[right] = data[left];
            data[left] = ch;
            left++;
            right--;

        }
        return new String(data);
    }

    public boolean isPalindrome(String input){

        if (input == null){
            throw new NullPointerException("Input string must be there") ;
        }
        if (input.isEmpty()){
            throw new IllegalArgumentException("Input string must have at least one character");
        }
        String originalString = input;
        String reversedString = reverseString(input);

        return originalString.equals(reversedString);
    }


    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();

        System.out.println("Given string is palindrome " + palindrome.isPalindrome("kadam"));
    }

}
