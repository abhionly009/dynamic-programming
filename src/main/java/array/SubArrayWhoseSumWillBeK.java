package main.java.array;

public class SubArrayWhoseSumWillBeK {

    public int findSum(int [] input, int k){

        int left =0;
        int count =0;
        int sum =0;

        for (int right =0;right<input.length;right++){

            sum += input[right];

            while (sum>k && left<=right){
                sum -= input[left];
                left++;
            }

            if (sum == k){
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {

        int [] input = {1,2,3,4,5,7,9};

        SubArrayWhoseSumWillBeK subArrayWhoseSumWillBeK = new SubArrayWhoseSumWillBeK();

        int result = subArrayWhoseSumWillBeK.findSum(input,9);
        System.out.println(result);
    }

}
