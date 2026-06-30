package main.java.array;

public class MissingNumberInArray {

    public int findMissingNumber(int [] input){

        int n = input.length;

        int sumOfFirstNNumbers = n*(n+1)/2;

        int actualSum = 0;

        for (int num:input){
            actualSum += num;
        }

        return sumOfFirstNNumbers - actualSum;
    }

    public static void main(String[] args) {
        int [] input = {9,6,4,2,3,5,7,0,1};
        MissingNumberInArray missingNumberInArray = new MissingNumberInArray();
        int result =  missingNumberInArray.findMissingNumber(input);
        System.out.println(result);

    }
}
