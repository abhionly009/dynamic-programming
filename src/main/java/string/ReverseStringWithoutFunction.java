package main.java.string;

public class ReverseStringWithoutFunction {

    public String reverse(String input){

        char [] arr = input.toCharArray();

        int left =0;
        int right = input.length()-1;

        while(left<right){
            char ch = arr[left];
            arr[left] = arr[right];
            arr[right] = ch;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {

        String input = "abhinandan";

        ReverseStringWithoutFunction stringWithoutFunction = new ReverseStringWithoutFunction();
       String result = stringWithoutFunction.reverse(input);
        System.out.println(input);
        System.out.println(result);

    }
}
