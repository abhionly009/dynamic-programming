package main.java.practice2026.array;

public class Merge2SortedArray {

    public static void merge(int [] arr, int [] input){

        int [] result = new int[arr.length+input.length];
        int i =0;
        int j =0;
        int k =0;
        while (i<arr.length && j<input.length){

            if (arr[i]<input[j]){
                result[k++] = arr[i++];

            }else {
                result[k++] = input[j++];
            }
        }

        while (i<arr.length){
            result[k++] = arr[i++];
        }
        while (j<input.length){
            result[k++] = input[j++];
        }

        for(Integer num :result){
            System.out.print( num +" ");
        }

    }

    public static void main(String[] args) {

        int [] arr = {2,4,5,7,10};
        int [] input = {1,3,4,6,9};

        merge(arr,input);

    }
}
