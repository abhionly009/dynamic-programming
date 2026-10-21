package main.java.practice2026;

public class Findthesumandaverageofarrayelements {

    public static int [] findSumAndAverage(int [] arr){
        int sum = 0;

        for (Integer num : arr){
            sum += num;
        }

        int avg = sum/arr.length;

        return new int[] {sum,avg};
    }

    public static void main(String[] args) {

        int [] arr = {1,4,6,8,3};
        // sum = 22
        // avg = 4

        int [] result = findSumAndAverage(arr);

        System.out.println(result[0]);
        System.out.println(result[1]);



    }
}
