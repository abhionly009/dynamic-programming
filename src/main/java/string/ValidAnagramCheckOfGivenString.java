package main.java.string;

public class ValidAnagramCheckOfGivenString {

    public boolean isValidAnagram(String input){

        int left = 0;
        int right = input.length()-1;
        char [] arr = input.toCharArray();
        while (left<=right){
            char ch = arr[left];
            arr[left] = arr[right];
            arr[right] = ch;
            left++;
            right--;
        }

        return input.equals(new String(arr));
    }

    public static void main(String[] args) {

        String inValidInput = "madan";
        String validInput = "madam";
        ValidAnagramCheckOfGivenString validAnagramCheckOfGivenString = new ValidAnagramCheckOfGivenString();

        boolean isValid = validAnagramCheckOfGivenString.isValidAnagram(validInput);
        System.out.println(isValid);
        boolean invalidResult = validAnagramCheckOfGivenString.isValidAnagram(inValidInput);
        System.out.println(invalidResult);
    }
}
