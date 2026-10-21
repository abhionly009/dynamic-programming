package main.java.practice2026.array;

import java.util.Arrays;

public class FindCommandElementsInTwoArray {

    public static void findCommon(int [] arr, int [] input){

        Arrays.sort(arr);
        Arrays.sort(input);

        int j =0;
        int i =0;
        while (i<arr.length&& j <input.length){
            if (arr[i] == input[j]){
                System.out.println("common in both " + arr[i]);
                j++;
                i++;
            }else if (arr[i]<input[j]){
                i++;
            }else {
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int [] arr = {1,4,6,7,3,9};
        int [] input = {3,2,4,1,8,9};

        findCommon(arr,input);

    }
}
