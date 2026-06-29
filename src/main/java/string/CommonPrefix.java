package main.java.string;

import java.util.Arrays;

public class CommonPrefix {

    public String findPrefix(String [] input){

        StringBuilder sb = new StringBuilder("");

        Arrays.sort(input);

        String first = input[0];

        String last = input[input.length-1];

        for (int i =0;i<Math.min(first.length(),last.length());i++){
            if (first.charAt(i)!= last.charAt(i)){
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        CommonPrefix commonPrefix = new CommonPrefix();
//        String [] input =  {"interview", "interconnect", "internal", "interval"};
        String [] input = {"flower", "flow", "flight"};
        String commonString = commonPrefix.findPrefix(input);
        System.out.println(commonString);
    }
}
