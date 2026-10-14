package main.java.practice2026.twoPointer;

public class TwoSumInSortedArray {

    public static int [] findIndex(int [] input, int target){
        int left = 0;
        int right = input.length-1;

        while (left<right){

            int sum = input[left]+ input[right];
            if (sum == target){
                return new int []{left,right};
            }else if (sum<target){
                left++;
            }else{
                right--;
            }

        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        int [] input = {1,2,4,6,9};
        int target = 19;

       int [] result = findIndex(input,target);

        System.out.println("found at " + result[0] +"  " + result[1]);

    }
}
