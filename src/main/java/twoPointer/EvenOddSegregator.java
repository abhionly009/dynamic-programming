package main.java.twoPointer;

import java.util.Arrays;

public class EvenOddSegregator {

    public void segregateEvenAndOdd(int [] input){

        if (input == null || input.length<=1){
            return;
        }

        int left =0;
        int right = input.length-1;
        while(left<right){
            while (left<right && input[left]%2==0){
                left++;
            }
            while (left<right && input[right]%2 !=0){
                right--;
            }


            if (left<right){
                int temp = input[left];
                input[left] = input[right];
                input[right] = temp;
                left++;
                right--;
            }
        }


    }


    public static void main(String[] args) {

        EvenOddSegregator evenOddSegregator = new EvenOddSegregator();
        int [] input = {12, 34, 45, 9, 8, 90, 3};
        System.out.println("original Array" + Arrays.toString(input));

        evenOddSegregator.segregateEvenAndOdd(input);

        System.out.println("Segregated Array " + Arrays.toString(input));


    }
}
