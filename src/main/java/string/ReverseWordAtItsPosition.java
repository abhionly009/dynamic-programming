package main.java.string;

import java.util.Arrays;

public class ReverseWordAtItsPosition {

    public String reverseWord(String input){

    ReverseStringWithoutFunction stringWithoutFunction = new ReverseStringWithoutFunction();

        String [] str = input.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<str.length;i++){

           stringBuilder.append(stringWithoutFunction.reverse(str[i])+" ");


        }

        return new String(stringBuilder);

    }

    public static void main(String[] args) {

        String str = "Hello world I am Abhinandan";
        ReverseWordAtItsPosition reverseWordAtItsPosition = new ReverseWordAtItsPosition();
        String result = reverseWordAtItsPosition.reverseWord(str);
        System.out.println(result);
    }
}
