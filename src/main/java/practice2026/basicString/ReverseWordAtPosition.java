package main.java.practice2026.basicString;

public class ReverseWordAtPosition {

    public static String reverse(String input){

        String [] str = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String string :str){
            stringBuilder.append(ReverseString.reverse(string));
            stringBuilder.append(" ");
        }
        return new String(stringBuilder);
    }

    public static void main(String[] args) {

        String input = "Hello java world!";

       String revered =  reverse(input);

        System.out.println(input);
        System.out.println(revered);

    }
}
