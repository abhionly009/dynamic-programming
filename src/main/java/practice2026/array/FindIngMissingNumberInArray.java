package main.java.practice2026.array;

public class FindIngMissingNumberInArray {

// Find the missing number in an array containing numbers from 1 to N.
    public static int missingNumber(int [] input){
        int n = input.length+1;
        int sumOfFirstNNumbers = n*(n+1)/2;

        System.out.println(sumOfFirstNNumbers);

        int actualSum = 0;

        for (Integer num :input){
            actualSum += num;
        }

        return  sumOfFirstNNumbers - actualSum;

    }

    public static void main(String[] args) {

        int [] arr = {9,6,4,2,3,5,7,1};

        System.out.println( missingNumber(arr));
    }
}
