package main.java.array;

public class MaxConsecutiveOnes {


        public int findMax(int [] nums){
            int count = 0;
            int max = 0;

            for (int i=0;i<nums.length;i++){
                if (nums[i] ==1 ){
                    count++;
                }else {
                    max = Math.max(max,count);
                    count = 0;
                }


            }
            return max;
        }

        public static void main(String[] args) {
            int [] input = {1,1,0,1};
            System.out.println();
            main.java.array.MaxConsecutiveOnes maxConsecutiveOnes = new main.java.array.MaxConsecutiveOnes();
            int res = maxConsecutiveOnes.findMax(input);
            System.out.println(res);
        }


}
