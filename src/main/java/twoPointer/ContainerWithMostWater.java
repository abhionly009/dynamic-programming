package main.java.twoPointer;

public class ContainerWithMostWater {

        public int findArea(int [] input){
            if (input ==null){
                throw new NullPointerException("Input can not be null");
            }

            if (input.length<2){
                throw new IllegalArgumentException("Container size should be greater than 2");
            }


            int left = 0;
            int right = input.length-1;
            int maxArea = 0;

            while(left<right){

                int width = right-left;
                int currentHeight = Math.min(input[left],input[right]);

                int area = width*currentHeight;
                maxArea = Math.max(maxArea,area);

                if (input[left]<input[right]){
                    left++;
                }else {
                    right--;
                }

            }
            return maxArea;
        }

        public static void main(String[] args) {

            int [] height = {9,8,6,2,5,4,8,3,7};
            ContainerWithMostWater water = new ContainerWithMostWater();
            int result =  water.findArea(height);

            System.out.println("Area between two pillar is " +result +" which will store maximum water");

        }
    }


