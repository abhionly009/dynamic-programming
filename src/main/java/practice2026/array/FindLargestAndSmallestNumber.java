package main.java.practice2026.array;

public class FindLargestAndSmallestNumber {

    public static int [] find(int []arr){

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (Integer num : arr){

            if (num<smallest){
                smallest = num;
            } if (num>largest) {
                largest = num;
            }
        }

        return new int[]{smallest,largest};

    }

    public static void main(String[] args) {

        int [] arr  = {5, 2, 8, 3};

       int [] result =  find(arr);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
