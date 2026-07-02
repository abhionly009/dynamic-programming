package main.java.array;

public class SubArraySumEqualsK {

    public int findSubArrayWhoseSumWillBeK(int [] input, int k){

        int sum =0;
        int count =0;
        int left =0;

        for (int right =0;right<input.length;right++){

            sum +=input[right];
            if (sum>k && left<=right){
                sum -= input[left];
            }

            if (sum ==k){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int [] input = {1,1,1};

        SubArraySumEqualsK subArraySumEqualsK = new SubArraySumEqualsK();

       int result = subArraySumEqualsK.findSubArrayWhoseSumWillBeK(input,2);

        System.out.println(result);


    }
}
