package main.java.practice2026.array;

public class ReverseAnArrayUsing2Pointer {

    public static void reverse(int [] arr){

        int left = 0;
        int right = arr.length-1;

        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }

        for (Integer num : arr){
            System.out.print(num +" ");
        }
    }

    public static void main(String[] args) {

        int [] arr = {12,34,56,0,99};
        reverse(arr);

    }
}
