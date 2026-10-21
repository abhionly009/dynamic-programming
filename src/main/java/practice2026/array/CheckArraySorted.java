package main.java.practice2026.array;

public class CheckArraySorted {

    public static void isSorted(int [] arr){
        boolean isSorted = true;

        for (int i =1;i<arr.length;i++){
            if (arr[i-1] > arr[i]){
               isSorted = false;
               break;
            }
        }

        System.out.println( "Array is sorted " + isSorted);
    }

    public static void main(String[] args) {

        int [] arr = {1, 1, 2, 4};

        isSorted(arr);

    }
}
