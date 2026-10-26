package main.java.practice2026.array;

public class MaximumSumOfSubArrayOfSizeK {

    public static int maximumSum(int [] arr, int k){

        int currentSum = 0;


        for (int i =0;i<k;i++){
            currentSum = currentSum+ arr[i];
        }

        int maxSum = currentSum;

        for (int i=k;i<arr.length;i++){
            currentSum = currentSum-arr[i-k]+arr[i];

            maxSum = Math.max(maxSum,currentSum);
        }

        return maxSum;


    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
       int result =  maximumSum(arr,3);

        System.out.println(result);
    }
}
