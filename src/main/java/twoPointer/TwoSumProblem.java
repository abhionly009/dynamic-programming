package main.java.twoPointer;

/**
 * Given sorted Array need to find the indexes so that the sum of these two number is equal to target
 * value if not found return -1,-1
 */
public class TwoSumProblem {

    public int [] findIndexes (int [] input, int target){

        if (input == null){
            throw new NullPointerException("Array should not be null");
        }


        int left = 0;
        int right = input.length-1;
        while(left<right) {
            if (input[left] + input[right] == target) {
                return new int[]{left, right};
            } else if (input[left] + input[right] >target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] {-1,-1};

    }

    public static void main(String[] args) {
        int [] input = {1,4,6,8,9,11};
//        int [] input = null;

        TwoSumProblem twoSumProblem = new TwoSumProblem();
        int [] result =  twoSumProblem.findIndexes(input,14);

        System.out.println(result[0] +" " + result[1]);
    }

}
