package main.java.array;

public class SingleNumberOptimize {

        public int findSingleNumber(int [] input){
            int index = 0;

            for (int i =0;i<input.length;i++){

                index = index^input[i];
            }

            return index;
        }

        public static void main(String[] args) {

            int [] input = {1,4,2,1,2};

            main.java.array.SingleNumberOptimize singleNumberOptimize = new main.java.array.SingleNumberOptimize();
            int result = singleNumberOptimize.findSingleNumber(input);
            System.out.println(result);
        }
}
