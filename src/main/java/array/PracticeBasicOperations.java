package main.java.array;

import java.util.ArrayList;
import java.util.List;

public class PracticeBasicOperations {

    // Given integer array find all the even and odd number from it
    // input [1,2,5,6,9,10,8];
    // even [2,6,10,8]
    // odd [1,5,9]


    public void segregateEvenAndOdd(int [] input){

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i=0;i<input.length;i++){

            if (input[i]%2==0){
                even.add(input[i]);
            }else {
                odd.add(input[i]);
            }
        }


        for(Integer num: even){
            System.out.print(num +" ");
        }
        System.out.println();

        for (Integer num:odd){
            System.out.print(num +" ");
        }

    }


    // reverse array

    public void reverse(int [] input){

        int left = 0;
        int right = input.length-1;

        while(left<right){
            int temp = input[right];
            input[right] = input[left];
            input[left] = temp;
            left++;
            right--;
        }

        for (int i =0;i<input.length;i++){
            System.out.print(input[i] );
            if (i != input.length-1){
                System.out.print(",");
            }
        }

    }

    // square the number and put it in the place where it was in array
    // without using external space
    public void square(int [] input){
        for (int right =0;right<input.length;right++){
            input[right] = input[right]* input[right];
        }
        for (int i =0;i<input.length;i++){
            System.out.print(input[i] );
            if (i != input.length-1){
                System.out.print(",");
            }
        }
    }

    // find sum of array elements

    public void sumOfArray(int [] input){

        int totalSum = 0;

        for (Integer num:input){
            totalSum += num;
        }

        System.out.println(totalSum);
    }


    // find the maximum number in array

    public void findMax(int [] input){

        int max = input[0];

        for (int i =1;i<input.length;i++){

            if (max<input[i]){
                max = input[i];
            }

        }

        System.out.println("Max " + max);
    }

    public void findMin(int [] input){
        int min = input[0];

        for (int i =1;i<input.length;i++){
            if (min>input[i]){
                min = input[i];
            }
        }

        System.out.println( "Min " + min);
    }

    // find target element if found then print it else not found

    public void findElement(int [] input, int target){
        boolean isAvailable = true;

        for (Integer num: input){
            if (num==target){
               isAvailable = true;
                break;
            }else {
                isAvailable = false;
            }
        }

        System.out.println(isAvailable);

    }



    public static void main(String[] args) {

        int [] input = {1,-2,3,4,5,6,7,8,9};

        PracticeBasicOperations practiceBasicOperations = new PracticeBasicOperations();

        practiceBasicOperations.segregateEvenAndOdd(input);
        System.out.println();
        practiceBasicOperations.reverse(input);

        practiceBasicOperations.square(input);


        practiceBasicOperations.sumOfArray(input);

        practiceBasicOperations.findMax(input);
        practiceBasicOperations.findMin(input);

        practiceBasicOperations.findElement(input,10);


    }
}
