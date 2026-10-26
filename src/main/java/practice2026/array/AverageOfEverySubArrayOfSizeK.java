package main.java.practice2026.array;

import java.util.Arrays;

public class AverageOfEverySubArrayOfSizeK {

    public static double [] findAverage(int [] arr, int k){

        double [] avg = new double[arr.length-k+1];

        int currentSum = 0;
        int p = 0;
        for (int i=0;i<k;i++){
            currentSum += arr[i];
        }
        avg[p++] = (double) currentSum/k;


        for (int i =k;i<arr.length;i++){

            int avrg = (currentSum - arr[i-k] + arr[i]);

            avg[p++] = (double) avrg/k;
        }

        return avg;
    }

    public static void main(String[] args) {


       int [] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};

       double [] result =  findAverage(arr,5);

        System.out.println(Arrays.toString(result));
    }

}
