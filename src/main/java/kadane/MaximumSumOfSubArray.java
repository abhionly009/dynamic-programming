package main.java.kadane;

public class MaximumSumOfSubArray {

    public int findSum(int [] input){

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0;i<input.length;i++){

            currentSum += input[i];
            maxSum = Math.max(currentSum,maxSum);

            if (currentSum<0){
                currentSum = 0;
            }

        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaximumSumOfSubArray sumOfSubArray = new MaximumSumOfSubArray();

        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        int result = sumOfSubArray.findSum(arr);
        System.out.println(result);
    }
}
