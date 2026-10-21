package main.java.practice2026.array;

public class FindPairToMakeSum {

    public static int [] findIndex(int [] arr, int target){

        int left =0;
        int right = arr.length-1;

        while (left<right){

            int sum = arr[left]+ arr[right];
            if (sum==target){
                return new int[]{left,right};
            }else if (sum<target){
                left++;
            }else{
                right--;
            }

        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {

        int [] arr = {2,3,5,1,7,8};

        int [] result = findIndex(arr,89);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }
}
