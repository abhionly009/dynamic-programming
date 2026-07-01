package main.java.array;

public class RemoveDuplicateFromArray {

    public int remove(int [] nums){
        int res = 1;

        for(int i =1;i<nums.length;i++){
            if (nums[i]!= nums[i-1]){
                nums[res] = nums[i];
                res++;
            }
        }

        return res;

    }

    public static void main(String[] args) {

        int [] input = {0,0,1,1,1,2,2,3,3,4};

        RemoveDuplicateFromArray removeDuplicateFromArray = new RemoveDuplicateFromArray();

        int res = removeDuplicateFromArray.remove(input);

        System.out.println(res);

    }
}
