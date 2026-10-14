package main.java.practice2026.basicString;

public class ReverseString {

    public static String reverse(String input){

        char [] ch = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = ch.length-1;i>=0;i--){
            sb.append(ch[i]);
        }

        return new String(sb);
    }

    public static void main(String[] args) {
        String original = "Abhinandan";

        String reversedString = reverse(original);

        System.out.println(" Original "+ original);
        System.out.println("After Reversed "+reversedString);

    }
}
