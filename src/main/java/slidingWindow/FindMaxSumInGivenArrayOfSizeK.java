package main.java.slidingWindow;
/**
 * Given an array find the max sum of size k
 * example
 *  int [] array  = {4,3,5,6,5,9,2};
 *  k = 3
 *  first window_sum = 4+3+5 = 12,
 *  Second window_sum = 3+5+6 = 14,
 *  third window_sum = 5+6+5 = 16,
 *  fourth window_sum = 6+5+9 = 20,
 *  fifth window_sum = 5+9+2 = 16
 *
 *  in all the window sum 20 is the highest number so the function should return the highest one
 */
public class FindMaxSumInGivenArrayOfSizeK {
    public int calculateMaxSum(int [] input, int k){

        if (input == null){
            throw new NullPointerException("Array can not be null");
        }
        if (input.length<1){
            throw new IllegalArgumentException("Array should have at least one element");
        }
        if (input.length<k){
            throw new IllegalArgumentException("Window size is greater than array size");
        }
        if (k<2){
            throw new IllegalArgumentException("Window size must be greater than one");
        }

        int windowSum = 0;
        for(int i =0;i<k;i++){
            windowSum += input[i];
        }

        int maxSum = windowSum;

        for (int i =k;i<input.length;i++){

            windowSum += input[i] - input[i-k];
            maxSum = Math.max(maxSum,windowSum);

        }

        return maxSum;

    }

    public static void main(String[] args) {
        FindMaxSumInGivenArrayOfSizeK findMaxSumInGivenArrayOfSizeK = new FindMaxSumInGivenArrayOfSizeK();
        int [] input = {4,3,5,6,5,9,2};
        int result = findMaxSumInGivenArrayOfSizeK.calculateMaxSum(input,3);
        System.out.println(result);
    }
}
