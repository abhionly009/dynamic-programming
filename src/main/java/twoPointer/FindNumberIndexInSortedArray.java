package main.java.twoPointer;

public class FindNumberIndexInSortedArray {
    public int findIndex(int [] input, int target){
        int left = 0;
        int right = input.length-1;
        if (input == null){
            throw new NullPointerException("Array can not be null");
        }
        if (input.length<1){
            throw new IllegalArgumentException("Array must have at least one element");
        }

        while (left<right){
            if (input[left]!=target && input[left]<=target){
                left++;
            } if (input[right]!=target && input[right]>target){
                right--;
            } if (input[right] == target ) {
                return right;
            } if (input[left] == target){
                return left;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindNumberIndexInSortedArray findNumberIndexInSortedArray = new FindNumberIndexInSortedArray();
        int [] arr = {10,30,53,59,60,75,79,90};
        int result = findNumberIndexInSortedArray.findIndex(arr,53);
        System.out.println(result);

    }
}
