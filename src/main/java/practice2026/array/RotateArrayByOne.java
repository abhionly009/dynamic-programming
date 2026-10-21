package main.java.practice2026.array;

public class RotateArrayByOne {

    public static void rotate(int [] arr){
        int temp = arr[0];

        for (int i =1;i<arr.length;i++){

            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = temp;
        for (Integer num :arr){
            System.out.print(num );
        }

    }

    public static void main(String[] args) {

        int [] arr = {1,9,8,5};
        rotate(arr);

    }
}
