package main.java.twoPointer;

public class ReverseString {

    public String reverse(String input){

        if (input.isEmpty()){
            throw new IllegalArgumentException("Input should not be empty");
        }

        int left =0;
        int right = input.length()-1;
        char [] chars = input.toCharArray();
        while(left<right){
            char temp = chars[right];
            chars[right] = chars[left];
            chars[left] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
       String result = reverseString.reverse("Hello");

        System.out.println(result);
    }
}
