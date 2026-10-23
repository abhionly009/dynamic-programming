package main.java.practice2026.array;

import java.util.Arrays;

public class ProductExceptSelfInArray {

    public static int [] product(int [] arr){

        int[] result = new int[arr.length];

        int leftProduct = 1;
        int rightProduct = 1;

        for (int i = 0; i < arr.length; i++) {
            result[i] = leftProduct;
            leftProduct *= arr[i];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4};
        System.out.println(Arrays.toString(product(arr)));
    }
}
