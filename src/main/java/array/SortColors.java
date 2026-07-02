package main.java.array;

public class SortColors {

    public int [] sort(int [] nums){
        for (int i=0;i<nums.length;i++){
            for (int j =i;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        SortColors colors = new SortColors();
        int [] input = {2,0,2,1,0,1,1};
        int [] result = colors.sort(input);

        for (int num : result){
            System.out.print( num +" ");
        }

    }
}
